// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum CardNumberType implements ToQueryParam {
    FPAN("fpan"),
    NETWORK_TOKEN("network_token");
    private final String value;

    CardNumberType(String value) {
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
