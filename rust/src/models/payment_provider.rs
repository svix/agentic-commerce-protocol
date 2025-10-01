// this file is @generated
use serde::{Deserialize, Serialize};

use super::{payment_method_type::PaymentMethodType, payment_provider_type::PaymentProviderType};

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct PaymentProvider {
    pub provider: PaymentProviderType,
    pub supported_payment_methods: Vec<PaymentMethodType>,
}
