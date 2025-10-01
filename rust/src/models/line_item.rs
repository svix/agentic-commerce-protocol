// this file is @generated
use serde::{Deserialize, Serialize};

use super::item::Item;

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct LineItem {
    pub id: String,
    pub item: Item,
    pub base_amount: i32,
    pub discount: i32,
    pub subtotal: i32,
    pub tax: i32,
    pub total: i32,
}
