// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;

@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@JsonSerialize(using = MessageSerializer.class)
@JsonDeserialize(using = MessageDeserializer.class)
public class Message {
    private MessageConfig data;

    public Message data(MessageConfig data) {
        this.data = data;
        return this;
    }

    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }

    public static Message fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Message.class);
    }
}

@Getter
@NoArgsConstructor
class MessageSurrogate {
    @JsonProperty("type")
    String type;

    @JsonProperty("data")
    JsonNode data;

    MessageSurrogate(Message o, String type, JsonNode data) {
        this.type = type;
        this.data = data;
    }
}

class MessageSerializer extends StdSerializer<Message> {
    public MessageSerializer() {
        this(null);
    }

    public MessageSerializer(Class<Message> t) {
        super(t);
    }

    @Override
    public void serialize(Message value, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        MessageSurrogate surrogate =
                new MessageSurrogate(
                        value, value.getData().getVariantName(), value.getData().toJsonNode());
        gen.writeObject(surrogate);
    }
}

class MessageDeserializer extends StdDeserializer<Message> {
    public MessageDeserializer() {
        this(null);
    }

    public MessageDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Message deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        MessageSurrogate surrogate = p.getCodec().readValue(p, MessageSurrogate.class);
        String type = surrogate.getType();
        JsonNode data = surrogate.getData();
        MessageConfig sourceType = MessageConfig.fromTypeAndConfig(type, data);
        return new Message(sourceType);
    }
}
