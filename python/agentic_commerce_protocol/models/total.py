# this file is @generated

from .common import BaseModel
from .total_type import TotalType


class Total(BaseModel):
    type: TotalType
    display_text: str
    amount: int
