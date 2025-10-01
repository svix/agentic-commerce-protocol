# this file is @generated

from .common import BaseModel
from .event_data_order import EventDataOrder
from .webhook_event_type import WebhookEventType


class WebhookEvent(BaseModel):
    type: WebhookEventType
    data: EventDataOrder
