// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ErrorCode {
    #[serde(rename = "missing")]
    Missing,
    #[serde(rename = "invalid")]
    Invalid,
    #[serde(rename = "out_of_stock")]
    OutOfStock,
    #[serde(rename = "payment_declined")]
    PaymentDeclined,
    #[serde(rename = "requires_sign_in")]
    RequiresSignIn,
    #[serde(rename = "requires_3ds")]
    Requires3ds,
}

impl fmt::Display for ErrorCode {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Missing => "missing",
            Self::Invalid => "invalid",
            Self::OutOfStock => "out_of_stock",
            Self::PaymentDeclined => "payment_declined",
            Self::RequiresSignIn => "requires_sign_in",
            Self::Requires3ds => "requires_3ds",
        };
        f.write_str(value)
    }
}
