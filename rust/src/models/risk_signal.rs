// this file is @generated
use serde::{Deserialize, Serialize};

use super::{risk_signal_action::RiskSignalAction, risk_signal_type::RiskSignalType};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct RiskSignal {
    pub r#type: RiskSignalType,
    pub score: i32,
    pub action: RiskSignalAction,
}
