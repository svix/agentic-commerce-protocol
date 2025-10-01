# this file is @generated
import typing as t

from .address import Address
from .buyer import Buyer
from .checkout_session_status import CheckoutSessionStatus
from .common import BaseModel
from .fulfillment_option import FulfillmentOption
from .line_item import LineItem
from .link import Link
from .message import Message
from .order import Order
from .payment_provider import PaymentProvider
from .total import Total


class CheckoutSession(BaseModel):
    id: str
    buyer: t.Optional[Buyer] = None
    payment_provider: t.Optional[PaymentProvider] = None
    status: CheckoutSessionStatus
    currency: str
    line_items: t.List[LineItem]
    fulfillment_address: t.Optional[Address] = None
    fulfillment_options: t.List[FulfillmentOption]
    fulfillment_option_id: t.Optional[str] = None
    totals: t.List[Total]
    messages: t.List[Message]
    links: t.List[Link]
    order: t.Optional[Order] = None
