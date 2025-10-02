// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class CheckoutSessionStatus : ToQueryParam {
    @SerialName("not_ready_for_payment") NOT_READY_FOR_PAYMENT,
    @SerialName("ready_for_payment") READY_FOR_PAYMENT,
    @SerialName("completed") COMPLETED,
    @SerialName("canceled") CANCELED,
    @SerialName("in_progress") IN_PROGRESS;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
