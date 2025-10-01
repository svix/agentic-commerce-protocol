// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RiskSignalAction {
    #[serde(rename = "blocked")]
    Blocked,
    #[serde(rename = "manual_review")]
    ManualReview,
    #[serde(rename = "authorized")]
    Authorized,
}

impl fmt::Display for RiskSignalAction {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Blocked => "blocked",
            Self::ManualReview => "manual_review",
            Self::Authorized => "authorized",
        };
        f.write_str(value)
    }
}
