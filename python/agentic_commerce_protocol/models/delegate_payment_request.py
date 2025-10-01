# this file is @generated
import typing as t

from .address import Address
from .allowance import Allowance
from .common import BaseModel
from .payment_method_card import PaymentMethodCard
from .risk_signal import RiskSignal


class DelegatePaymentRequest(BaseModel):
    payment_method: PaymentMethodCard
    allowance: Allowance
    billing_address: t.Optional[Address] = None
    risk_signals: t.List[RiskSignal]
    metadata: t.Dict[str, str]
