# this file is @generated

from .common import BaseModel


class Order(BaseModel):
    id: str
    checkout_session_id: str
    permalink_url: str
