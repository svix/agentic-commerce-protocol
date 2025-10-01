# this file is @generated

from .allowance_reason import AllowanceReason
from .common import BaseModel


class Allowance(BaseModel):
    reason: AllowanceReason
    max_amount: int
    currency: str
    checkout_session_id: str
    merchant_id: str
    expires_at: str
