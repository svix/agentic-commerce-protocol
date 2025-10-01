// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RiskSignalType {
    #[serde(rename = "card_testing")]
    CardTesting,
}

impl fmt::Display for RiskSignalType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::CardTesting => "card_testing",
        };
        f.write_str(value)
    }
}
