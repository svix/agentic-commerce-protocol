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
public class Allowance {
    @JsonProperty private AllowanceReason reason;

    @JsonProperty("max_amount")
    private Long maxAmount;

    @JsonProperty private String currency;

    @JsonProperty("checkout_session_id")
    private String checkoutSessionId;

    @JsonProperty("merchant_id")
    private String merchantId;

    @JsonProperty("expires_at")
    private String expiresAt;

    public Allowance() {}

    public Allowance reason(AllowanceReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @javax.annotation.Nonnull
    public AllowanceReason getReason() {
        return reason;
    }

    public void setReason(AllowanceReason reason) {
        this.reason = reason;
    }

    public Allowance maxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    /**
     * Get maxAmount
     *
     * @return maxAmount
     */
    @javax.annotation.Nonnull
    public Long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Allowance currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     */
    @javax.annotation.Nonnull
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Allowance checkoutSessionId(String checkoutSessionId) {
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

    public Allowance merchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    /**
     * Get merchantId
     *
     * @return merchantId
     */
    @javax.annotation.Nonnull
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Allowance expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     *
     * @return expiresAt
     */
    @javax.annotation.Nonnull
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Create an instance of Allowance given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Allowance
     * @throws JsonProcessingException if the JSON string is invalid with respect to Allowance
     */
    public static Allowance fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Allowance.class);
    }

    /**
     * Convert an instance of Allowance to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
