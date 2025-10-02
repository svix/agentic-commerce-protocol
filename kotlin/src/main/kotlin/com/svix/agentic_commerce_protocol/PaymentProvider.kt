// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentProvider(
    val provider: PaymentProviderType,
    @SerialName("supported_payment_methods") val supportedPaymentMethods: List<PaymentMethodType>,
)
