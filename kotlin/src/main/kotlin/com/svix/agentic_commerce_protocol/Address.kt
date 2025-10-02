// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Address(
    val name: String,
    @SerialName("line_one") val lineOne: String,
    @SerialName("line_two") val lineTwo: String? = null,
    val city: String,
    val state: String,
    val country: String,
    @SerialName("postal_code") val postalCode: String,
)
