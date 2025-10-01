// this file is @generated
use serde::{Deserialize, Serialize};

use super::{address::Address, buyer::Buyer, item::Item};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct CheckoutSessionUpdateRequest {
    #[serde(skip_serializing_if = "Option::is_none")]
    pub buyer: Option<Buyer>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub items: Option<Vec<Item>>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub fulfillment_address: Option<Address>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub fulfillment_option_id: Option<String>,
}
