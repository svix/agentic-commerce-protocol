// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum WebhookOrderStatus {
    #[serde(rename = "created")]
    Created,
    #[serde(rename = "manual_review")]
    ManualReview,
    #[serde(rename = "confirmed")]
    Confirmed,
    #[serde(rename = "canceled")]
    Canceled,
    #[serde(rename = "shipped")]
    Shipped,
    #[serde(rename = "fulfilled")]
    Fulfilled,
}

impl fmt::Display for WebhookOrderStatus {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::Created => "created",
            Self::ManualReview => "manual_review",
            Self::Confirmed => "confirmed",
            Self::Canceled => "canceled",
            Self::Shipped => "shipped",
            Self::Fulfilled => "fulfilled",
        };
        f.write_str(value)
    }
}
