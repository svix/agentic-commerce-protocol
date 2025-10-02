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

@Serializable(with = MessageSerializer::class) data class Message(val data: MessageData)

@Serializable
sealed class MessageData {
    val variantName: String
        get() = this::class.annotations.filterIsInstance<VariantName>().first().name

    abstract fun toJsonElement(): JsonElement

    @VariantName("info")
    data class Info(val info: MessageInfo) : MessageData() {
        override fun toJsonElement() = Json.encodeToJsonElement(MessageInfo.serializer(), info)
    }

    @VariantName("error")
    data class Error(val error: MessageError) : MessageData() {
        override fun toJsonElement() = Json.encodeToJsonElement(MessageError.serializer(), error)
    }

    companion object {
        private val typeMap =
            mapOf<String, (JsonElement) -> MessageData>(
                "info" to
                    { data ->
                        Info(Json.decodeFromJsonElement(MessageInfo.serializer(), data))
                    },
                "error" to
                    { data ->
                        Error(Json.decodeFromJsonElement(MessageError.serializer(), data))
                    },
            )

        fun fromTypeAndData(type: String, data: JsonElement): MessageData {
            return typeMap[type]?.invoke(data)
                ?: throw SerializationException("Unknown type: $type")
        }
    }
}

class MessageSerializer : KSerializer<Message> {
    @Serializable private data class MessageSurrogate(val type: String, val data: JsonElement)

    override val descriptor: SerialDescriptor = MessageSurrogate.serializer().descriptor

    override fun serialize(encoder: Encoder, value: Message) {
        val surrogate =
            MessageSurrogate(type = value.data.variantName, data = value.data.toJsonElement())
        encoder.encodeSerializableValue(MessageSurrogate.serializer(), surrogate)
    }

    override fun deserialize(decoder: Decoder): Message {
        val surrogate = decoder.decodeSerializableValue(MessageSurrogate.serializer())
        return Message(data = MessageData.fromTypeAndData(surrogate.type, surrogate.data))
    }
}
