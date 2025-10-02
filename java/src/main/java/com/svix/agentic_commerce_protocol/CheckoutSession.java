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
public class CheckoutSession {
    @JsonProperty private String id;
    @JsonProperty private Buyer buyer;

    @JsonProperty("payment_provider")
    private PaymentProvider paymentProvider;

    @JsonProperty private CheckoutSessionStatus status;
    @JsonProperty private String currency;

    @JsonProperty("line_items")
    private List<LineItem> lineItems;

    @JsonProperty("fulfillment_address")
    private Address fulfillmentAddress;

    @JsonProperty("fulfillment_options")
    private List<FulfillmentOption> fulfillmentOptions;

    @JsonProperty("fulfillment_option_id")
    private String fulfillmentOptionId;

    @JsonProperty private List<Total> totals;
    @JsonProperty private List<Message> messages;
    @JsonProperty private List<Link> links;
    @JsonProperty private Order order;

    public CheckoutSession() {}

    public CheckoutSession id(String id) {
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

    public CheckoutSession buyer(Buyer buyer) {
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

    public CheckoutSession paymentProvider(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
        return this;
    }

    /**
     * Get paymentProvider
     *
     * @return paymentProvider
     */
    @javax.annotation.Nullable
    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public CheckoutSession status(CheckoutSessionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    public CheckoutSessionStatus getStatus() {
        return status;
    }

    public void setStatus(CheckoutSessionStatus status) {
        this.status = status;
    }

    public CheckoutSession currency(String currency) {
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

    public CheckoutSession lineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public CheckoutSession addLineItemsItem(LineItem lineItemsItem) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(lineItemsItem);

        return this;
    }

    /**
     * Get lineItems
     *
     * @return lineItems
     */
    @javax.annotation.Nonnull
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public CheckoutSession fulfillmentAddress(Address fulfillmentAddress) {
        this.fulfillmentAddress = fulfillmentAddress;
        return this;
    }

    /**
     * Get fulfillmentAddress
     *
     * @return fulfillmentAddress
     */
    @javax.annotation.Nullable
    public Address getFulfillmentAddress() {
        return fulfillmentAddress;
    }

    public void setFulfillmentAddress(Address fulfillmentAddress) {
        this.fulfillmentAddress = fulfillmentAddress;
    }

    public CheckoutSession fulfillmentOptions(List<FulfillmentOption> fulfillmentOptions) {
        this.fulfillmentOptions = fulfillmentOptions;
        return this;
    }

    public CheckoutSession addFulfillmentOptionsItem(FulfillmentOption fulfillmentOptionsItem) {
        if (this.fulfillmentOptions == null) {
            this.fulfillmentOptions = new ArrayList<>();
        }
        this.fulfillmentOptions.add(fulfillmentOptionsItem);

        return this;
    }

    /**
     * Get fulfillmentOptions
     *
     * @return fulfillmentOptions
     */
    @javax.annotation.Nonnull
    public List<FulfillmentOption> getFulfillmentOptions() {
        return fulfillmentOptions;
    }

    public void setFulfillmentOptions(List<FulfillmentOption> fulfillmentOptions) {
        this.fulfillmentOptions = fulfillmentOptions;
    }

    public CheckoutSession fulfillmentOptionId(String fulfillmentOptionId) {
        this.fulfillmentOptionId = fulfillmentOptionId;
        return this;
    }

    /**
     * Get fulfillmentOptionId
     *
     * @return fulfillmentOptionId
     */
    @javax.annotation.Nullable
    public String getFulfillmentOptionId() {
        return fulfillmentOptionId;
    }

    public void setFulfillmentOptionId(String fulfillmentOptionId) {
        this.fulfillmentOptionId = fulfillmentOptionId;
    }

    public CheckoutSession totals(List<Total> totals) {
        this.totals = totals;
        return this;
    }

    public CheckoutSession addTotalsItem(Total totalsItem) {
        if (this.totals == null) {
            this.totals = new ArrayList<>();
        }
        this.totals.add(totalsItem);

        return this;
    }

    /**
     * Get totals
     *
     * @return totals
     */
    @javax.annotation.Nonnull
    public List<Total> getTotals() {
        return totals;
    }

    public void setTotals(List<Total> totals) {
        this.totals = totals;
    }

    public CheckoutSession messages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public CheckoutSession addMessagesItem(Message messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);

        return this;
    }

    /**
     * Get messages
     *
     * @return messages
     */
    @javax.annotation.Nonnull
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public CheckoutSession links(List<Link> links) {
        this.links = links;
        return this;
    }

    public CheckoutSession addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);

        return this;
    }

    /**
     * Get links
     *
     * @return links
     */
    @javax.annotation.Nonnull
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public CheckoutSession order(Order order) {
        this.order = order;
        return this;
    }

    /**
     * Get order
     *
     * @return order
     */
    @javax.annotation.Nullable
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Create an instance of CheckoutSession given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckoutSession
     * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutSession
     */
    public static CheckoutSession fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, CheckoutSession.class);
    }

    /**
     * Convert an instance of CheckoutSession to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
