// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DelegatePaymentRequest(
    @SerialName("payment_method") val paymentMethod: PaymentMethodCard,
    val allowance: Allowance,
    @SerialName("billing_address") val billingAddress: Address? = null,
    @SerialName("risk_signals") val riskSignals: List<RiskSignal>,
    val metadata: Map<String, String>,
)
