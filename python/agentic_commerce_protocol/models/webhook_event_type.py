# this file is @generated
from enum import Enum


class WebhookEventType(str, Enum):
    ORDER_CREATE = "order_create"
    ORDER_UPDATE = "order_update"

    def __str__(self) -> str:
        return str(self.value)
