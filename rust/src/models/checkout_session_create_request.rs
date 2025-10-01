// this file is @generated
use serde::{Deserialize, Serialize};

use super::{address::Address, buyer::Buyer, item::Item};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct CheckoutSessionCreateRequest {
    #[serde(skip_serializing_if = "Option::is_none")]
    pub buyer: Option<Buyer>,
    pub items: Vec<Item>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub fulfillment_address: Option<Address>,
}
