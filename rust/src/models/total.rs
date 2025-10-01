// this file is @generated
use serde::{Deserialize, Serialize};

use super::total_type::TotalType;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Total {
    pub r#type: TotalType,
    pub display_text: String,
    pub amount: i32,
}
