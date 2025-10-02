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
public class CheckoutSessionCreateRequest {
    @JsonProperty private Buyer buyer;
    @JsonProperty private List<Item> items;

    @JsonProperty("fulfillment_address")
    private Address fulfillmentAddress;

    public CheckoutSessionCreateRequest() {}

    public CheckoutSessionCreateRequest buyer(Buyer buyer) {
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

    public CheckoutSessionCreateRequest items(List<Item> items) {
        this.items = items;
        return this;
    }

    public CheckoutSessionCreateRequest addItemsItem(Item itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);

        return this;
    }

    /**
     * Get items
     *
     * @return items
     */
    @javax.annotation.Nonnull
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public CheckoutSessionCreateRequest fulfillmentAddress(Address fulfillmentAddress) {
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

    /**
     * Create an instance of CheckoutSessionCreateRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckoutSessionCreateRequest
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     CheckoutSessionCreateRequest
     */
    public static CheckoutSessionCreateRequest fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, CheckoutSessionCreateRequest.class);
    }

    /**
     * Convert an instance of CheckoutSessionCreateRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
