# this file is @generated
from enum import Enum


class ErrorCode(str, Enum):
    MISSING = "missing"
    INVALID = "invalid"
    OUT_OF_STOCK = "out_of_stock"
    PAYMENT_DECLINED = "payment_declined"
    REQUIRES_SIGN_IN = "requires_sign_in"
    REQUIRES_3DS = "requires_3ds"

    def __str__(self) -> str:
        return str(self.value)
