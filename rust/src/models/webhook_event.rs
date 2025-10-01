// this file is @generated
use serde::{Deserialize, Serialize};

use super::{event_data_order::EventDataOrder, webhook_event_type::WebhookEventType};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct WebhookEvent {
    pub r#type: WebhookEventType,
    pub data: EventDataOrder,
}
