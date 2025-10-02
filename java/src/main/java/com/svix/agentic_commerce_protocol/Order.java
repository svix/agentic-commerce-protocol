// This file is @generated
package com.svix.agentic_commerce_protocol;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Order {
    @JsonProperty private String id;

    @JsonProperty("checkout_session_id")
    private String checkoutSessionId;

    @JsonProperty("permalink_url")
    private String permalinkUrl;

    public Order() {}

    public Order id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order checkoutSessionId(String checkoutSessionId) {
        this.checkoutSessionId = checkoutSessionId;
        return this;
    }

    /**
     * Get checkoutSessionId
     *
     * @return checkoutSessionId
     */
    @javax.annotation.Nonnull
    public String getCheckoutSessionId() {
        return checkoutSessionId;
    }

    public void setCheckoutSessionId(String checkoutSessionId) {
        this.checkoutSessionId = checkoutSessionId;
    }

    public Order permalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
        return this;
    }

    /**
     * Get permalinkUrl
     *
     * @return permalinkUrl
     */
    @javax.annotation.Nonnull
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    /**
     * Create an instance of Order given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Order
     * @throws JsonProcessingException if the JSON string is invalid with respect to Order
     */
    public static Order fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Order.class);
    }

    /**
     * Convert an instance of Order to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
