// this file is @generated
use serde::{Deserialize, Serialize};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Address {
    pub name: String,
    pub line_one: String,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub line_two: Option<String>,
    pub city: String,
    pub state: String,
    pub country: String,
    pub postal_code: String,
}
