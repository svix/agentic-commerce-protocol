// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethodCard(
    val type: String,
    @SerialName("card_number_type") val cardNumberType: CardNumberType,
    val number: String,
    @SerialName("exp_month") val expMonth: String? = null,
    @SerialName("exp_year") val expYear: String? = null,
    val name: String? = null,
    val cvc: String? = null,
    val cryptogram: String? = null,
    @SerialName("eci_value") val eciValue: String? = null,
    @SerialName("checks_performed") val checksPerformed: List<CheckPerformedType>? = null,
    val iin: String? = null,
    @SerialName("display_card_funding_type") val displayCardFundingType: CardFundingType,
    @SerialName("display_wallet_type") val displayWalletType: String? = null,
    @SerialName("display_brand") val displayBrand: String? = null,
    @SerialName("display_last4") val displayLast4: String? = null,
    val metadata: Map<String, String>,
)
