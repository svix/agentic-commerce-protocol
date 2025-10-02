// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum CheckoutSessionStatus implements ToQueryParam {
    NOT_READY_FOR_PAYMENT("not_ready_for_payment"),
    READY_FOR_PAYMENT("ready_for_payment"),
    COMPLETED("completed"),
    CANCELED("canceled"),
    IN_PROGRESS("in_progress");
    private final String value;

    CheckoutSessionStatus(String value) {
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
