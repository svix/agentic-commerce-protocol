// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

@Serializable(with = FulfillmentOptionSerializer::class)
data class FulfillmentOption(val data: FulfillmentOptionData)

@Serializable
sealed class FulfillmentOptionData {
    val variantName: String
        get() = this::class.annotations.filterIsInstance<VariantName>().first().name

    abstract fun toJsonElement(): JsonElement

    @VariantName("shipping")
    data class Shipping(val shipping: FulfillmentOptionShipping) : FulfillmentOptionData() {
        override fun toJsonElement() =
            Json.encodeToJsonElement(FulfillmentOptionShipping.serializer(), shipping)
    }

    @VariantName("digital")
    data class Digital(val digital: FulfillmentOptionDigital) : FulfillmentOptionData() {
        override fun toJsonElement() =
            Json.encodeToJsonElement(FulfillmentOptionDigital.serializer(), digital)
    }

    companion object {
        private val typeMap =
            mapOf<String, (JsonElement) -> FulfillmentOptionData>(
                "shipping" to
                    { data ->
                        Shipping(
                            Json.decodeFromJsonElement(FulfillmentOptionShipping.serializer(), data)
                        )
                    },
                "digital" to
                    { data ->
                        Digital(
                            Json.decodeFromJsonElement(FulfillmentOptionDigital.serializer(), data)
                        )
                    },
            )

        fun fromTypeAndData(type: String, data: JsonElement): FulfillmentOptionData {
            return typeMap[type]?.invoke(data)
                ?: throw SerializationException("Unknown type: $type")
        }
    }
}

class FulfillmentOptionSerializer : KSerializer<FulfillmentOption> {
    @Serializable
    private data class FulfillmentOptionSurrogate(val type: String, val data: JsonElement)

    override val descriptor: SerialDescriptor = FulfillmentOptionSurrogate.serializer().descriptor

    override fun serialize(encoder: Encoder, value: FulfillmentOption) {
        val surrogate =
            FulfillmentOptionSurrogate(
                type = value.data.variantName,
                data = value.data.toJsonElement(),
            )
        encoder.encodeSerializableValue(FulfillmentOptionSurrogate.serializer(), surrogate)
    }

    override fun deserialize(decoder: Decoder): FulfillmentOption {
        val surrogate = decoder.decodeSerializableValue(FulfillmentOptionSurrogate.serializer())
        return FulfillmentOption(
            data = FulfillmentOptionData.fromTypeAndData(surrogate.type, surrogate.data)
        )
    }
}
