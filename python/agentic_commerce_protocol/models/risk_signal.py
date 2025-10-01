# this file is @generated

from .common import BaseModel
from .risk_signal_action import RiskSignalAction
from .risk_signal_type import RiskSignalType


class RiskSignal(BaseModel):
    type: RiskSignalType
    score: int
    action: RiskSignalAction
