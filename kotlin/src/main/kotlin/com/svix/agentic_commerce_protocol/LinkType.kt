// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
enum class LinkType : ToQueryParam {
    @SerialName("terms_of_use") TERMS_OF_USE,
    @SerialName("privacy_policy") PRIVACY_POLICY,
    @SerialName("seller_shop_policies") SELLER_SHOP_POLICIES;

    override fun toQueryParam() = Json.encodeToJsonElement(this).jsonPrimitive.content
}
