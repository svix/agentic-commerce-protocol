# this file is @generated
import typing as t

from pydantic import ModelWrapValidatorHandler, model_validator
from typing_extensions import Self

from .common import BaseModel
from .fulfillment_option_digital import FulfillmentOptionDigital
from .fulfillment_option_shipping import FulfillmentOptionShipping


class FulfillmentOption(BaseModel):
    type: t.Union[t.Literal["shipping"], t.Literal["digital"]]
    data: t.Union[FulfillmentOptionShipping, FulfillmentOptionDigital]

    @model_validator(mode="wrap")
    @classmethod
    def validate_model(
        cls, data: t.Any, handler: ModelWrapValidatorHandler[Self]
    ) -> Self:
        output = handler(data)
        if output.type == "shipping":
            output.data = FulfillmentOptionShipping.model_validate(data.get("data", {}))
        elif output.type == "digital":
            output.data = FulfillmentOptionDigital.model_validate(data.get("data", {}))
        else:
            raise ValueError(f"Unexpected type `{output.type}`")
        return output
