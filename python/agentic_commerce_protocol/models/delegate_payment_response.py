# this file is @generated
import typing as t

from .common import BaseModel


class DelegatePaymentResponse(BaseModel):
    id: str
    created: str
    metadata: t.Dict[str, str]
