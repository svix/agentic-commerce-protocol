# this file is @generated

from .common import BaseModel
from .refund_type import RefundType


class Refund(BaseModel):
    type: RefundType
    amount: int
