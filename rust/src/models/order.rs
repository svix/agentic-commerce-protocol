// this file is @generated
use serde::{Deserialize, Serialize};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Order {
    pub id: String,
    pub checkout_session_id: String,
    pub permalink_url: String,
}
