// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EventDataOrder(
    val type: String,
    @SerialName("checkout_session_id") val checkoutSessionId: String,
    @SerialName("permalink_url") val permalinkUrl: String,
    val status: WebhookOrderStatus,
    val refunds: List<Refund>,
)
