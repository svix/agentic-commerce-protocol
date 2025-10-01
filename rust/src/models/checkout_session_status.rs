// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CheckoutSessionStatus {
    #[serde(rename = "not_ready_for_payment")]
    NotReadyForPayment,
    #[serde(rename = "ready_for_payment")]
    ReadyForPayment,
    #[serde(rename = "completed")]
    Completed,
    #[serde(rename = "canceled")]
    Canceled,
    #[serde(rename = "in_progress")]
    InProgress,
}

impl fmt::Display for CheckoutSessionStatus {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::NotReadyForPayment => "not_ready_for_payment",
            Self::ReadyForPayment => "ready_for_payment",
            Self::Completed => "completed",
            Self::Canceled => "canceled",
            Self::InProgress => "in_progress",
        };
        f.write_str(value)
    }
}
