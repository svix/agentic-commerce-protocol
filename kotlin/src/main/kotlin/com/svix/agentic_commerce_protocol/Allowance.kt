// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Allowance(
    val reason: AllowanceReason,
    @SerialName("max_amount") val maxAmount: Long,
    val currency: String,
    @SerialName("checkout_session_id") val checkoutSessionId: String,
    @SerialName("merchant_id") val merchantId: String,
    @SerialName("expires_at") val expiresAt: String,
)
