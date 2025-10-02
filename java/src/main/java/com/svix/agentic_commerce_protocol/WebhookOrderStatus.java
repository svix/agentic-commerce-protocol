// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum WebhookOrderStatus implements ToQueryParam {
    CREATED("created"),
    MANUAL_REVIEW("manual_review"),
    CONFIRMED("confirmed"),
    CANCELED("canceled"),
    SHIPPED("shipped"),
    FULFILLED("fulfilled");
    private final String value;

    WebhookOrderStatus(String value) {
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
