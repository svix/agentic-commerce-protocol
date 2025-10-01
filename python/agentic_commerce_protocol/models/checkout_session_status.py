# this file is @generated
from enum import Enum


class CheckoutSessionStatus(str, Enum):
    NOT_READY_FOR_PAYMENT = "not_ready_for_payment"
    READY_FOR_PAYMENT = "ready_for_payment"
    COMPLETED = "completed"
    CANCELED = "canceled"
    IN_PROGRESS = "in_progress"

    def __str__(self) -> str:
        return str(self.value)
