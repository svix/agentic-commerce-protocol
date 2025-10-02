// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum ErrorType implements ToQueryParam {
    INVALID_REQUEST("invalid_request"),
    REQUEST_NOT_IDEMPOTENT("request_not_idempotent"),
    PROCESSING_ERROR("processing_error"),
    SERVICE_UNAVAILABLE("service_unavailable");
    private final String value;

    ErrorType(String value) {
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
