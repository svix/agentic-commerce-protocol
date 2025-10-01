// this file is @generated
use serde::{Deserialize, Serialize};

use super::{
    fulfillment_option_digital::FulfillmentOptionDigital,
    fulfillment_option_shipping::FulfillmentOptionShipping,
};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
#[serde(tag = "type", content = "data")]
pub enum FulfillmentOption {
    #[serde(rename = "shipping")]
    Shipping(FulfillmentOptionShipping),
    #[serde(rename = "digital")]
    Digital(FulfillmentOptionDigital),
}
