// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum WebhookEventType {
    #[serde(rename = "order_create")]
    OrderCreate,
    #[serde(rename = "order_update")]
    OrderUpdate,
}

impl fmt::Display for WebhookEventType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::OrderCreate => "order_create",
            Self::OrderUpdate => "order_update",
        };
        f.write_str(value)
    }
}
