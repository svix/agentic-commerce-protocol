# this file is @generated
import typing as t

from .common import BaseModel


class FulfillmentOptionShipping(BaseModel):
    id: str
    title: str
    subtitle: t.Optional[str] = None
    carrier: t.Optional[str] = None
    earliest_delivery_time: t.Optional[str] = None
    latest_delivery_time: t.Optional[str] = None
    subtotal: int
    tax: int
    total: int
