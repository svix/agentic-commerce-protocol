// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class PaymentProviderType : ToQueryParam {
    @SerialName("stripe") STRIPE;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
