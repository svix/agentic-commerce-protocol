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
public class EventDataOrder {
    @JsonProperty private String type;

    @JsonProperty("checkout_session_id")
    private String checkoutSessionId;

    @JsonProperty("permalink_url")
    private String permalinkUrl;

    @JsonProperty private WebhookOrderStatus status;
    @JsonProperty private List<Refund> refunds;

    public EventDataOrder() {}

    public EventDataOrder type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventDataOrder checkoutSessionId(String checkoutSessionId) {
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

    public EventDataOrder permalinkUrl(String permalinkUrl) {
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

    public EventDataOrder status(WebhookOrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    public WebhookOrderStatus getStatus() {
        return status;
    }

    public void setStatus(WebhookOrderStatus status) {
        this.status = status;
    }

    public EventDataOrder refunds(List<Refund> refunds) {
        this.refunds = refunds;
        return this;
    }

    public EventDataOrder addRefundsItem(Refund refundsItem) {
        if (this.refunds == null) {
            this.refunds = new ArrayList<>();
        }
        this.refunds.add(refundsItem);

        return this;
    }

    /**
     * Get refunds
     *
     * @return refunds
     */
    @javax.annotation.Nonnull
    public List<Refund> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    /**
     * Create an instance of EventDataOrder given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EventDataOrder
     * @throws JsonProcessingException if the JSON string is invalid with respect to EventDataOrder
     */
    public static EventDataOrder fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, EventDataOrder.class);
    }

    /**
     * Convert an instance of EventDataOrder to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
