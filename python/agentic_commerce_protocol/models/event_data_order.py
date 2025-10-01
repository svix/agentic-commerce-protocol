# this file is @generated
import typing as t

from .common import BaseModel
from .refund import Refund
from .webhook_order_status import WebhookOrderStatus


class EventDataOrder(BaseModel):
    type: str
    checkout_session_id: str
    permalink_url: str
    status: WebhookOrderStatus
    refunds: t.List[Refund]
