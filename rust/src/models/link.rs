// this file is @generated
use serde::{Deserialize, Serialize};

use super::link_type::LinkType;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct Link {
    pub r#type: LinkType,
    pub url: String,
}
