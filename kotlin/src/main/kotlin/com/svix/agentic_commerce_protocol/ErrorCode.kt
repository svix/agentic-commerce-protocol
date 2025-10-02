// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class ErrorCode : ToQueryParam {
    @SerialName("missing") MISSING,
    @SerialName("invalid") INVALID,
    @SerialName("out_of_stock") OUT_OF_STOCK,
    @SerialName("payment_declined") PAYMENT_DECLINED,
    @SerialName("requires_sign_in") REQUIRES_SIGN_IN,
    @SerialName("requires_3ds") REQUIRES_3DS;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
