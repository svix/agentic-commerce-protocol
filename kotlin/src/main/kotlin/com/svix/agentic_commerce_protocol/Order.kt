// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Order(
    val id: String,
    @SerialName("checkout_session_id") val checkoutSessionId: String,
    @SerialName("permalink_url") val permalinkUrl: String,
)
