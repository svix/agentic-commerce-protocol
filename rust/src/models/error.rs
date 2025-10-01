// this file is @generated
use serde::{Deserialize, Serialize};

use super::error_type::ErrorType;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Error {
    pub r#type: ErrorType,
    pub code: String,
    pub message: String,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub param: Option<String>,
}
