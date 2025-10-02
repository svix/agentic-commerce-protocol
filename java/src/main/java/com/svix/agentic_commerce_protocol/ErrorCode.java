// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum ErrorCode implements ToQueryParam {
    MISSING("missing"),
    INVALID("invalid"),
    OUT_OF_STOCK("out_of_stock"),
    PAYMENT_DECLINED("payment_declined"),
    REQUIRES_SIGN_IN("requires_sign_in"),
    REQUIRES_3DS("requires_3ds");
    private final String value;

    ErrorCode(String value) {
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
