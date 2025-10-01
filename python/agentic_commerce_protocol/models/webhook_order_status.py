# this file is @generated
from enum import Enum


class WebhookOrderStatus(str, Enum):
    CREATED = "created"
    MANUAL_REVIEW = "manual_review"
    CONFIRMED = "confirmed"
    CANCELED = "canceled"
    SHIPPED = "shipped"
    FULFILLED = "fulfilled"

    def __str__(self) -> str:
        return str(self.value)
