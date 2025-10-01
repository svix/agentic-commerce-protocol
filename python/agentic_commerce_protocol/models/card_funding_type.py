# this file is @generated
from enum import Enum


class CardFundingType(str, Enum):
    CREDIT = "credit"
    DEBIT = "debit"
    PREPAID = "prepaid"

    def __str__(self) -> str:
        return str(self.value)
