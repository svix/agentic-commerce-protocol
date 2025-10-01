// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum PaymentProviderType {
    #[serde(rename = "stripe")]
    Stripe,
}

impl fmt::Display for PaymentProviderType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Stripe => "stripe",
        };
        f.write_str(value)
    }
}
