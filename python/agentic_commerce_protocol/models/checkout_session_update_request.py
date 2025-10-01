# this file is @generated
import typing as t

from .address import Address
from .buyer import Buyer
from .common import BaseModel
from .item import Item


class CheckoutSessionUpdateRequest(BaseModel):
    buyer: t.Optional[Buyer] = None
    items: t.Optional[t.List[Item]] = None
    fulfillment_address: t.Optional[Address] = None
    fulfillment_option_id: t.Optional[str] = None
