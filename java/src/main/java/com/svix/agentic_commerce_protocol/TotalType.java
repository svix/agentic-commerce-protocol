// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum TotalType implements ToQueryParam {
    ITEMS_BASE_AMOUNT("items_base_amount"),
    ITEMS_DISCOUNT("items_discount"),
    SUBTOTAL("subtotal"),
    DISCOUNT("discount"),
    FULFILLMENT("fulfillment"),
    TAX("tax"),
    FEE("fee"),
    TOTAL("total");
    private final String value;

    TotalType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @Override
    public String toQueryParam() {
        return this.value;
    }
}
