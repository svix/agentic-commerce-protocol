// this file is @generated
use serde::{Deserialize, Serialize};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct DelegatePaymentResponse {
    pub id: String,
    pub created: String,
    pub metadata: std::collections::HashMap<String, String>,
}
