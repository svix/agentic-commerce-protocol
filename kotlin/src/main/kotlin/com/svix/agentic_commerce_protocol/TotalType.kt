// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class TotalType : ToQueryParam {
    @SerialName("items_base_amount") ITEMS_BASE_AMOUNT,
    @SerialName("items_discount") ITEMS_DISCOUNT,
    @SerialName("subtotal") SUBTOTAL,
    @SerialName("discount") DISCOUNT,
    @SerialName("fulfillment") FULFILLMENT,
    @SerialName("tax") TAX,
    @SerialName("fee") FEE,
    @SerialName("total") TOTAL;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
