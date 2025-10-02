// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckoutSessionCompleteRequest(
    val buyer: Buyer? = null,
    @SerialName("payment_data") val paymentData: PaymentData,
)
