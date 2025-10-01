// this file is @generated
use serde::{Deserialize, Serialize};

use super::{message_error::MessageError, message_info::MessageInfo};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
#[serde(tag = "type", content = "data")]
pub enum Message {
    #[serde(rename = "info")]
    Info(MessageInfo),
    #[serde(rename = "error")]
    Error(MessageError),
}
