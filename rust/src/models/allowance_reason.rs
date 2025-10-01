// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum AllowanceReason {
    #[serde(rename = "one_time")]
    OneTime,
}

impl fmt::Display for AllowanceReason {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::OneTime => "one_time",
        };
        f.write_str(value)
    }
}
