# this file is @generated
from enum import Enum


class AllowanceReason(str, Enum):
    ONE_TIME = "one_time"

    def __str__(self) -> str:
        return str(self.value)
