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
public class PaymentData {
    @JsonProperty private String token;
    @JsonProperty private PaymentProviderType provider;

    @JsonProperty("billing_address")
    private Address billingAddress;

    public PaymentData() {}

    public PaymentData token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @javax.annotation.Nonnull
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PaymentData provider(PaymentProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get provider
     *
     * @return provider
     */
    @javax.annotation.Nonnull
    public PaymentProviderType getProvider() {
        return provider;
    }

    public void setProvider(PaymentProviderType provider) {
        this.provider = provider;
    }

    public PaymentData billingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * Get billingAddress
     *
     * @return billingAddress
     */
    @javax.annotation.Nullable
    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Create an instance of PaymentData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PaymentData
     * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentData
     */
    public static PaymentData fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, PaymentData.class);
    }

    /**
     * Convert an instance of PaymentData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
