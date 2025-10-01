# this file is @generated
import typing as t

from .common import BaseModel
from .error_type import ErrorType


class Error(BaseModel):
    type: ErrorType
    code: str
    message: str
    param: t.Optional[str] = None
