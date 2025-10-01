# this file is @generated
import typing as t

from .common import BaseModel


class FulfillmentOptionDigital(BaseModel):
    id: str
    title: str
    subtitle: t.Optional[str] = None
    subtotal: int
    tax: int
    total: int
