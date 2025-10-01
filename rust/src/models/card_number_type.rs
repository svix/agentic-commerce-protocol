// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CardNumberType {
    #[serde(rename = "fpan")]
    Fpan,
    #[serde(rename = "network_token")]
    NetworkToken,
}

impl fmt::Display for CardNumberType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Fpan => "fpan",
            Self::NetworkToken => "network_token",
        };
        f.write_str(value)
    }
}
