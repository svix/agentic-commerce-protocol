// this file is @generated
use serde::{Deserialize, Serialize};

use super::{content_type::ContentType, error_code::ErrorCode};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct MessageError {
    pub code: ErrorCode,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub param: Option<String>,
    pub content_type: ContentType,
    pub content: String,
}
