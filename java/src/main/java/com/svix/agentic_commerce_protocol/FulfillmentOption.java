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
@JsonSerialize(using = FulfillmentOptionSerializer.class)
@JsonDeserialize(using = FulfillmentOptionDeserializer.class)
public class FulfillmentOption {
    private FulfillmentOptionConfig data;

    public FulfillmentOption data(FulfillmentOptionConfig data) {
        this.data = data;
        return this;
    }

    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }

    public static FulfillmentOption fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, FulfillmentOption.class);
    }
}

@Getter
@NoArgsConstructor
class FulfillmentOptionSurrogate {
    @JsonProperty("type")
    String type;

    @JsonProperty("data")
    JsonNode data;

    FulfillmentOptionSurrogate(FulfillmentOption o, String type, JsonNode data) {
        this.type = type;
        this.data = data;
    }
}

class FulfillmentOptionSerializer extends StdSerializer<FulfillmentOption> {
    public FulfillmentOptionSerializer() {
        this(null);
    }

    public FulfillmentOptionSerializer(Class<FulfillmentOption> t) {
        super(t);
    }

    @Override
    public void serialize(FulfillmentOption value, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        FulfillmentOptionSurrogate surrogate =
                new FulfillmentOptionSurrogate(
                        value, value.getData().getVariantName(), value.getData().toJsonNode());
        gen.writeObject(surrogate);
    }
}

class FulfillmentOptionDeserializer extends StdDeserializer<FulfillmentOption> {
    public FulfillmentOptionDeserializer() {
        this(null);
    }

    public FulfillmentOptionDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public FulfillmentOption deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException {
        FulfillmentOptionSurrogate surrogate =
                p.getCodec().readValue(p, FulfillmentOptionSurrogate.class);
        String type = surrogate.getType();
        JsonNode data = surrogate.getData();
        FulfillmentOptionConfig sourceType = FulfillmentOptionConfig.fromTypeAndConfig(type, data);
        return new FulfillmentOption(sourceType);
    }
}
