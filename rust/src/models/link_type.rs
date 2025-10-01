// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum LinkType {
    #[serde(rename = "terms_of_use")]
    TermsOfUse,
    #[serde(rename = "privacy_policy")]
    PrivacyPolicy,
    #[serde(rename = "seller_shop_policies")]
    SellerShopPolicies,
}

impl fmt::Display for LinkType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::TermsOfUse => "terms_of_use",
            Self::PrivacyPolicy => "privacy_policy",
            Self::SellerShopPolicies => "seller_shop_policies",
        };
        f.write_str(value)
    }
}
