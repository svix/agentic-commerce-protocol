// this file is @generated
use serde::{Deserialize, Serialize};

use super::{
    card_funding_type::CardFundingType, card_number_type::CardNumberType,
    check_performed_type::CheckPerformedType,
};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct PaymentMethodCard {
    pub r#type: String,
    pub card_number_type: CardNumberType,
    pub number: String,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub exp_month: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub exp_year: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub cvc: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub cryptogram: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub eci_value: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub checks_performed: Option<Vec<CheckPerformedType>>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub iin: Option<String>,
    pub display_card_funding_type: CardFundingType,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub display_wallet_type: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub display_brand: Option<String>,
    #[serde(skip_serializing_if = "Option::is_none")]
    pub display_last4: Option<String>,
    pub metadata: std::collections::HashMap<String, String>,
}
