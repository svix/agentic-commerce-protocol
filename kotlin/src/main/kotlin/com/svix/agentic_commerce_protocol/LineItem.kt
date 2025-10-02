// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LineItem(
    val id: String,
    val item: Item,
    @SerialName("base_amount") val baseAmount: Long,
    val discount: Long,
    val subtotal: Long,
    val tax: Long,
    val total: Long,
)
