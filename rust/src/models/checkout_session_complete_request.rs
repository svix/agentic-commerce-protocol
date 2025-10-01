// this file is @generated
use serde::{Deserialize, Serialize};

use super::{buyer::Buyer, payment_data::PaymentData};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct CheckoutSessionCompleteRequest {
    #[serde(skip_serializing_if = "Option::is_none")]
    pub buyer: Option<Buyer>,
    pub payment_data: PaymentData,
}
