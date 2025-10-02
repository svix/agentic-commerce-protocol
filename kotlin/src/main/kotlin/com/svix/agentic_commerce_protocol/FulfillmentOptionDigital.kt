// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.Serializable

@Serializable
data class FulfillmentOptionDigital(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val subtotal: Long,
    val tax: Long,
    val total: Long,
)
