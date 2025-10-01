# this file is @generated
from enum import Enum


class PaymentProviderType(str, Enum):
    STRIPE = "stripe"

    def __str__(self) -> str:
        return str(self.value)
