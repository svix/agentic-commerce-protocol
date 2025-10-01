# this file is @generated
import typing as t

from .address import Address
from .common import BaseModel
from .payment_provider_type import PaymentProviderType


class PaymentData(BaseModel):
    token: str
    provider: PaymentProviderType
    billing_address: t.Optional[Address] = None
