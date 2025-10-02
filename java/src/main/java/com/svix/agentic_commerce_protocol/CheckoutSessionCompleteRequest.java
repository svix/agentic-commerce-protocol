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
public class CheckoutSessionCompleteRequest {
    @JsonProperty private Buyer buyer;

    @JsonProperty("payment_data")
    private PaymentData paymentData;

    public CheckoutSessionCompleteRequest() {}

    public CheckoutSessionCompleteRequest buyer(Buyer buyer) {
        this.buyer = buyer;
        return this;
    }

    /**
     * Get buyer
     *
     * @return buyer
     */
    @javax.annotation.Nullable
    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public CheckoutSessionCompleteRequest paymentData(PaymentData paymentData) {
        this.paymentData = paymentData;
        return this;
    }

    /**
     * Get paymentData
     *
     * @return paymentData
     */
    @javax.annotation.Nonnull
    public PaymentData getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(PaymentData paymentData) {
        this.paymentData = paymentData;
    }

    /**
     * Create an instance of CheckoutSessionCompleteRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckoutSessionCompleteRequest
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     CheckoutSessionCompleteRequest
     */
    public static CheckoutSessionCompleteRequest fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, CheckoutSessionCompleteRequest.class);
    }

    /**
     * Convert an instance of CheckoutSessionCompleteRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
