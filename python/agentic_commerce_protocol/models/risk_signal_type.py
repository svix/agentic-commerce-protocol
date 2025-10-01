# this file is @generated
from enum import Enum


class RiskSignalType(str, Enum):
    CARD_TESTING = "card_testing"

    def __str__(self) -> str:
        return str(self.value)
