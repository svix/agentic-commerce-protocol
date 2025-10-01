# this file is @generated
import typing as t

from .common import BaseModel


class Address(BaseModel):
    name: str
    line_one: str
    line_two: t.Optional[str] = None
    city: str
    state: str
    country: str
    postal_code: str
