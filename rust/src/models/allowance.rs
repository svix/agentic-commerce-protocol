// this file is @generated
use serde::{Deserialize, Serialize};

use super::allowance_reason::AllowanceReason;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Allowance {
    pub reason: AllowanceReason,
    pub max_amount: i32,
    pub currency: String,
    pub checkout_session_id: String,
    pub merchant_id: String,
    pub expires_at: String,
}
