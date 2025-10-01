# this file is @generated
from enum import Enum


class RiskSignalAction(str, Enum):
    BLOCKED = "blocked"
    MANUAL_REVIEW = "manual_review"
    AUTHORIZED = "authorized"

    def __str__(self) -> str:
        return str(self.value)
