# this file is @generated
from enum import Enum


class CardNumberType(str, Enum):
    FPAN = "fpan"
    NETWORK_TOKEN = "network_token"

    def __str__(self) -> str:
        return str(self.value)
