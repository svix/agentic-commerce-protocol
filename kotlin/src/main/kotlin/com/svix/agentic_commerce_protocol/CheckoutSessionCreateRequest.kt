// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckoutSessionCreateRequest(
    val buyer: Buyer? = null,
    val items: List<Item>,
    @SerialName("fulfillment_address") val fulfillmentAddress: Address? = null,
)
