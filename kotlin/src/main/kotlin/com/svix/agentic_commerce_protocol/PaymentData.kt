// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentData(
    val token: String,
    val provider: PaymentProviderType,
    @SerialName("billing_address") val billingAddress: Address? = null,
)
