# this file is @generated
import typing as t

from .common import BaseModel
from .content_type import ContentType


class MessageInfo(BaseModel):
    param: t.Optional[str] = None
    content_type: ContentType
    content: str
