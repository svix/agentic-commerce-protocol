// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckoutSession(
    val id: String,
    val buyer: Buyer? = null,
    @SerialName("payment_provider") val paymentProvider: PaymentProvider? = null,
    val status: CheckoutSessionStatus,
    val currency: String,
    @SerialName("line_items") val lineItems: List<LineItem>,
    @SerialName("fulfillment_address") val fulfillmentAddress: Address? = null,
    @SerialName("fulfillment_options") val fulfillmentOptions: List<FulfillmentOption>,
    @SerialName("fulfillment_option_id") val fulfillmentOptionId: String? = null,
    val totals: List<Total>,
    val messages: List<Message>,
    val links: List<Link>,
    val order: Order? = null,
)
