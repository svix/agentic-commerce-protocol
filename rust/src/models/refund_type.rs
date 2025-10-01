// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RefundType {
    #[serde(rename = "store_credit")]
    StoreCredit,
    #[serde(rename = "original_payment")]
    OriginalPayment,
}

impl fmt::Display for RefundType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::StoreCredit => "store_credit",
            Self::OriginalPayment => "original_payment",
        };
        f.write_str(value)
    }
}
