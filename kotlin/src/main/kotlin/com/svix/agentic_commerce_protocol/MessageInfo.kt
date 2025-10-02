// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageInfo(
    val param: String? = null,
    @SerialName("content_type") val contentType: ContentType,
    val content: String,
)
