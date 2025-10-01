// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum PaymentMethodType {
    #[serde(rename = "card")]
    Card,
}

impl fmt::Display for PaymentMethodType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Card => "card",
        };
        f.write_str(value)
    }
}
