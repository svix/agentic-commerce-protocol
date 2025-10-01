// this file is @generated
use serde::{Deserialize, Serialize};

use super::refund_type::RefundType;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Refund {
    pub r#type: RefundType,
    pub amount: i32,
}
