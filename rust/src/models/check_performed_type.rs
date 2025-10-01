// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CheckPerformedType {
    #[serde(rename = "avs")]
    Avs,
    #[serde(rename = "cvv")]
    Cvv,
    #[serde(rename = "ani")]
    Ani,
    #[serde(rename = "auth0")]
    Auth0,
}

impl fmt::Display for CheckPerformedType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Avs => "avs",
            Self::Cvv => "cvv",
            Self::Ani => "ani",
            Self::Auth0 => "auth0",
        };
        f.write_str(value)
    }
}
