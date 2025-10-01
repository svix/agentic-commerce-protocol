# this file is @generated
import typing as t

from .buyer import Buyer
from .common import BaseModel
from .payment_data import PaymentData


class CheckoutSessionCompleteRequest(BaseModel):
    buyer: t.Optional[Buyer] = None
    payment_data: PaymentData
