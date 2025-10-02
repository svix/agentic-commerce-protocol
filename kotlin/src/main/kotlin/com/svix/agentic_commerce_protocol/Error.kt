// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.Serializable

@Serializable
data class Error(
    val type: ErrorType,
    val code: String,
    val message: String,
    val param: String? = null,
)
