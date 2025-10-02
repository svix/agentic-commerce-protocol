// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum CheckPerformedType implements ToQueryParam {
    AVS("avs"),
    CVV("cvv"),
    ANI("ani"),
    AUTH0("auth0");
    private final String value;

    CheckPerformedType(String value) {
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
