# this file is @generated
from enum import Enum


class RefundType(str, Enum):
    STORE_CREDIT = "store_credit"
    ORIGINAL_PAYMENT = "original_payment"

    def __str__(self) -> str:
        return str(self.value)
