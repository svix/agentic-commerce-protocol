# this file is @generated
import typing as t

from .common import BaseModel
from .payment_method_type import PaymentMethodType
from .payment_provider_type import PaymentProviderType


class PaymentProvider(BaseModel):
    provider: PaymentProviderType
    supported_payment_methods: t.List[PaymentMethodType]
