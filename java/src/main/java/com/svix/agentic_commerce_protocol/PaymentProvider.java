// This file is @generated
package com.svix.agentic_commerce_protocol;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PaymentProvider {
    @JsonProperty private PaymentProviderType provider;

    @JsonProperty("supported_payment_methods")
    private List<PaymentMethodType> supportedPaymentMethods;

    public PaymentProvider() {}

    public PaymentProvider provider(PaymentProviderType provider) {
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

    public PaymentProvider supportedPaymentMethods(
            List<PaymentMethodType> supportedPaymentMethods) {
        this.supportedPaymentMethods = supportedPaymentMethods;
        return this;
    }

    public PaymentProvider addSupportedPaymentMethodsItem(
            PaymentMethodType supportedPaymentMethodsItem) {
        if (this.supportedPaymentMethods == null) {
            this.supportedPaymentMethods = new ArrayList<>();
        }
        this.supportedPaymentMethods.add(supportedPaymentMethodsItem);

        return this;
    }

    /**
     * Get supportedPaymentMethods
     *
     * @return supportedPaymentMethods
     */
    @javax.annotation.Nonnull
    public List<PaymentMethodType> getSupportedPaymentMethods() {
        return supportedPaymentMethods;
    }

    public void setSupportedPaymentMethods(List<PaymentMethodType> supportedPaymentMethods) {
        this.supportedPaymentMethods = supportedPaymentMethods;
    }

    /**
     * Create an instance of PaymentProvider given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PaymentProvider
     * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentProvider
     */
    public static PaymentProvider fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, PaymentProvider.class);
    }

    /**
     * Convert an instance of PaymentProvider to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
