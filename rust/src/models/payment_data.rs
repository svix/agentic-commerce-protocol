// this file is @generated
use serde::{Deserialize, Serialize};

use super::{address::Address, payment_provider_type::PaymentProviderType};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct PaymentData {
    pub token: String,
    pub provider: PaymentProviderType,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub billing_address: Option<Address>,
}
