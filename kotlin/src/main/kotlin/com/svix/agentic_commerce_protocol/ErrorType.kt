// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class ErrorType : ToQueryParam {
    @SerialName("invalid_request") INVALID_REQUEST,
    @SerialName("request_not_idempotent") REQUEST_NOT_IDEMPOTENT,
    @SerialName("processing_error") PROCESSING_ERROR,
    @SerialName("service_unavailable") SERVICE_UNAVAILABLE;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
