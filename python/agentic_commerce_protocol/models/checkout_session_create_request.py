# this file is @generated
import typing as t

from .address import Address
from .buyer import Buyer
from .common import BaseModel
from .item import Item


class CheckoutSessionCreateRequest(BaseModel):
    buyer: t.Optional[Buyer] = None
    items: t.List[Item]
    fulfillment_address: t.Optional[Address] = None
