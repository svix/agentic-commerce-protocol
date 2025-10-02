// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckoutSessionUpdateRequest(
    val buyer: Buyer? = null,
    val items: List<Item>? = null,
    @SerialName("fulfillment_address") val fulfillmentAddress: Address? = null,
    @SerialName("fulfillment_option_id") val fulfillmentOptionId: String? = null,
)
