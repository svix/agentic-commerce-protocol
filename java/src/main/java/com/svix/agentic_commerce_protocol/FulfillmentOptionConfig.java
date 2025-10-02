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
public abstract class FulfillmentOptionConfig {
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
    @VariantName("shipping")
    public static class Shipping extends FulfillmentOptionConfig {
        private final FulfillmentOptionShipping shipping;

        @Override
        public JsonNode toJsonNode() {
            return Utils.getObjectMapper().valueToTree(shipping);
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode(callSuper = false)
    @VariantName("digital")
    public static class Digital extends FulfillmentOptionConfig {
        private final FulfillmentOptionDigital digital;

        @Override
        public JsonNode toJsonNode() {
            return Utils.getObjectMapper().valueToTree(digital);
        }
    }

    @FunctionalInterface
    private interface TypeFactory {
        FulfillmentOptionConfig create(JsonNode config);
    }

    private static final Map<String, TypeFactory> TY_M = new HashMap<>();
    private static final ObjectMapper m = Utils.getObjectMapper();

    static {
        TY_M.put("shipping", c -> new Shipping(m.convertValue(c, FulfillmentOptionShipping.class)));
        TY_M.put("digital", c -> new Digital(m.convertValue(c, FulfillmentOptionDigital.class)));
    }

    public static FulfillmentOptionConfig fromTypeAndConfig(String type, JsonNode config) {
        TypeFactory factory = TY_M.get(type);
        if (factory == null) {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
        return factory.create(config);
    }
}
