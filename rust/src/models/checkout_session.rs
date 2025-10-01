// this file is @generated
use serde::{Deserialize, Serialize};

use super::{
    address::Address, buyer::Buyer, checkout_session_status::CheckoutSessionStatus,
    fulfillment_option::FulfillmentOption, line_item::LineItem, link::Link, message::Message,
    order::Order, payment_provider::PaymentProvider, total::Total,
};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct CheckoutSession {
    pub id: String,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub buyer: Option<Buyer>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub payment_provider: Option<PaymentProvider>,
    pub status: CheckoutSessionStatus,
    pub currency: String,
    pub line_items: Vec<LineItem>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub fulfillment_address: Option<Address>,
    pub fulfillment_options: Vec<FulfillmentOption>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub fulfillment_option_id: Option<String>,
    pub totals: Vec<Total>,
    pub messages: Vec<Message>,
    pub links: Vec<Link>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub order: Option<Order>,
}
