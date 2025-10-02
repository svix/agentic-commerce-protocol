// This file is @generated
package com.svix.agentic_commerce_protocol;

import com.fasterxml.jackson.annotation.JsonValue;
import com.svix.agentic_commerce_protocol.Utils.ToQueryParam;

public enum LinkType implements ToQueryParam {
    TERMS_OF_USE("terms_of_use"),
    PRIVACY_POLICY("privacy_policy"),
    SELLER_SHOP_POLICIES("seller_shop_policies");
    private final String value;

    LinkType(String value) {
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
