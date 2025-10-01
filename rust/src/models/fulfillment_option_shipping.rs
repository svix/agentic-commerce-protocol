// this file is @generated
use serde::{Deserialize, Serialize};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct FulfillmentOptionShipping {
    pub id: String,
    pub title: String,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub subtitle: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub carrier: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub earliest_delivery_time: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub latest_delivery_time: Option<String>,
    pub subtotal: i32,
    pub tax: i32,
    pub total: i32,
}
