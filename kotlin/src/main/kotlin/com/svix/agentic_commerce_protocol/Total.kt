// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Total(
    val type: TotalType,
    @SerialName("display_text") val displayText: String,
    val amount: Long,
)
