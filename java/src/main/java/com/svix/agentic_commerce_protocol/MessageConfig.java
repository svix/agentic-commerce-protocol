// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@ToString
@EqualsAndHashCode
public abstract class MessageConfig {
    @JsonIgnore
    public String getVariantName() {
        VariantName annotation = this.getClass().getAnnotation(VariantName.class);
        return annotation != null ? annotation.value() : null;
    }

    public abstract JsonNode toJsonNode();

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode(callSuper = false)
    @VariantName("info")
    public static class Info extends MessageConfig {
        private final MessageInfo info;

        @Override
        public JsonNode toJsonNode() {
            return Utils.getObjectMapper().valueToTree(info);
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode(callSuper = false)
    @VariantName("error")
    public static class Error extends MessageConfig {
        private final MessageError error;

        @Override
        public JsonNode toJsonNode() {
            return Utils.getObjectMapper().valueToTree(error);
        }
    }

    @FunctionalInterface
    private interface TypeFactory {
        MessageConfig create(JsonNode config);
    }

    private static final Map<String, TypeFactory> TY_M = new HashMap<>();
    private static final ObjectMapper m = Utils.getObjectMapper();

    static {
        TY_M.put("info", c -> new Info(m.convertValue(c, MessageInfo.class)));
        TY_M.put("error", c -> new Error(m.convertValue(c, MessageError.class)));
    }

    public static MessageConfig fromTypeAndConfig(String type, JsonNode config) {
        TypeFactory factory = TY_M.get(type);
        if (factory == null) {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
        return factory.create(config);
    }
}
