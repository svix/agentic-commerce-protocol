# this file is @generated
import typing as t

from pydantic import ModelWrapValidatorHandler, model_validator
from typing_extensions import Self

from .common import BaseModel
from .message_error import MessageError
from .message_info import MessageInfo


class Message(BaseModel):
    type: t.Union[t.Literal["info"], t.Literal["error"]]
    data: t.Union[MessageInfo, MessageError]

    @model_validator(mode="wrap")
    @classmethod
    def validate_model(
        cls, data: t.Any, handler: ModelWrapValidatorHandler[Self]
    ) -> Self:
        output = handler(data)
        if output.type == "info":
            output.data = MessageInfo.model_validate(data.get("data", {}))
        elif output.type == "error":
            output.data = MessageError.model_validate(data.get("data", {}))
        else:
            raise ValueError(f"Unexpected type `{output.type}`")
        return output
