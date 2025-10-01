# this file is @generated
import typing as t

from .common import BaseModel


class Buyer(BaseModel):
    first_name: str
    last_name: str
    email: str
    phone_number: t.Optional[str] = None
