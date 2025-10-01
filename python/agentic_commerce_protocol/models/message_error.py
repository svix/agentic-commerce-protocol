# this file is @generated
import typing as t

from .common import BaseModel
from .content_type import ContentType
from .error_code import ErrorCode


class MessageError(BaseModel):
    code: ErrorCode
    param: t.Optional[str] = None
    content_type: ContentType
    content: str
