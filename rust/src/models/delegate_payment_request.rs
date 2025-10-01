// this file is @generated
use serde::{Deserialize, Serialize};

use super::{
    address::Address, allowance::Allowance, payment_method_card::PaymentMethodCard,
    risk_signal::RiskSignal,
};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct DelegatePaymentRequest {
    pub payment_method: PaymentMethodCard,
    pub allowance: Allowance,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub billing_address: Option<Address>,
    pub risk_signals: Vec<RiskSignal>,
    pub metadata: std::collections::HashMap<String, String>,
}
