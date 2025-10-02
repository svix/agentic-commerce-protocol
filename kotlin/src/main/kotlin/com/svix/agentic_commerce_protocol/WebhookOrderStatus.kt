// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class WebhookOrderStatus : ToQueryParam {
    @SerialName("created") CREATED,
    @SerialName("manual_review") MANUAL_REVIEW,
    @SerialName("confirmed") CONFIRMED,
    @SerialName("canceled") CANCELED,
    @SerialName("shipped") SHIPPED,
    @SerialName("fulfilled") FULFILLED;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
