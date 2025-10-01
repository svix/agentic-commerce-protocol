# this file is @generated

from .common import BaseModel
from .item import Item


class LineItem(BaseModel):
    id: str
    item: Item
    base_amount: int
    discount: int
    subtotal: int
    tax: int
    total: int
