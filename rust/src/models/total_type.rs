// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TotalType {
    #[serde(rename = "items_base_amount")]
    ItemsBaseAmount,
    #[serde(rename = "items_discount")]
    ItemsDiscount,
    #[serde(rename = "subtotal")]
    Subtotal,
    #[serde(rename = "discount")]
    Discount,
    #[serde(rename = "fulfillment")]
    Fulfillment,
    #[serde(rename = "tax")]
    Tax,
    #[serde(rename = "fee")]
    Fee,
    #[serde(rename = "total")]
    Total,
}

impl fmt::Display for TotalType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::ItemsBaseAmount => "items_base_amount",
            Self::ItemsDiscount => "items_discount",
            Self::Subtotal => "subtotal",
            Self::Discount => "discount",
            Self::Fulfillment => "fulfillment",
            Self::Tax => "tax",
            Self::Fee => "fee",
            Self::Total => "total",
        };
        f.write_str(value)
    }
}
