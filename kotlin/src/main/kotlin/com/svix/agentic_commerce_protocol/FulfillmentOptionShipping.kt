// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FulfillmentOptionShipping(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val carrier: String? = null,
    @SerialName("earliest_delivery_time") val earliestDeliveryTime: String? = null,
    @SerialName("latest_delivery_time") val latestDeliveryTime: String? = null,
    val subtotal: Long,
    val tax: Long,
    val total: Long,
)
