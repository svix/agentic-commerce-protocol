// this file is @generated
use serde::{Deserialize, Serialize};

use super::{refund::Refund, webhook_order_status::WebhookOrderStatus};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct EventDataOrder {
    pub r#type: String,
    pub checkout_session_id: String,
    pub permalink_url: String,
    pub status: WebhookOrderStatus,
    pub refunds: Vec<Refund>,
}
