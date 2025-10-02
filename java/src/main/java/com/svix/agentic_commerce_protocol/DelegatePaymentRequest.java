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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DelegatePaymentRequest {
    @JsonProperty("payment_method")
    private PaymentMethodCard paymentMethod;

    @JsonProperty private Allowance allowance;

    @JsonProperty("billing_address")
    private Address billingAddress;

    @JsonProperty("risk_signals")
    private List<RiskSignal> riskSignals;

    @JsonProperty private Map<String, String> metadata;

    public DelegatePaymentRequest() {}

    public DelegatePaymentRequest paymentMethod(PaymentMethodCard paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Get paymentMethod
     *
     * @return paymentMethod
     */
    @javax.annotation.Nonnull
    public PaymentMethodCard getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodCard paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public DelegatePaymentRequest allowance(Allowance allowance) {
        this.allowance = allowance;
        return this;
    }

    /**
     * Get allowance
     *
     * @return allowance
     */
    @javax.annotation.Nonnull
    public Allowance getAllowance() {
        return allowance;
    }

    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
    }

    public DelegatePaymentRequest billingAddress(Address billingAddress) {
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

    public DelegatePaymentRequest riskSignals(List<RiskSignal> riskSignals) {
        this.riskSignals = riskSignals;
        return this;
    }

    public DelegatePaymentRequest addRiskSignalsItem(RiskSignal riskSignalsItem) {
        if (this.riskSignals == null) {
            this.riskSignals = new ArrayList<>();
        }
        this.riskSignals.add(riskSignalsItem);

        return this;
    }

    /**
     * Get riskSignals
     *
     * @return riskSignals
     */
    @javax.annotation.Nonnull
    public List<RiskSignal> getRiskSignals() {
        return riskSignals;
    }

    public void setRiskSignals(List<RiskSignal> riskSignals) {
        this.riskSignals = riskSignals;
    }

    public DelegatePaymentRequest metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DelegatePaymentRequest putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);

        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Create an instance of DelegatePaymentRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DelegatePaymentRequest
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     DelegatePaymentRequest
     */
    public static DelegatePaymentRequest fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, DelegatePaymentRequest.class);
    }

    /**
     * Convert an instance of DelegatePaymentRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
