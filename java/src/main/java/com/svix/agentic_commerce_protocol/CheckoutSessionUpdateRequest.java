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
public class CheckoutSessionUpdateRequest {
    @JsonProperty private Buyer buyer;
    @JsonProperty private List<Item> items;

    @JsonProperty("fulfillment_address")
    private Address fulfillmentAddress;

    @JsonProperty("fulfillment_option_id")
    private String fulfillmentOptionId;

    public CheckoutSessionUpdateRequest() {}

    public CheckoutSessionUpdateRequest buyer(Buyer buyer) {
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

    public CheckoutSessionUpdateRequest items(List<Item> items) {
        this.items = items;
        return this;
    }

    public CheckoutSessionUpdateRequest addItemsItem(Item itemsItem) {
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
    @javax.annotation.Nullable
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public CheckoutSessionUpdateRequest fulfillmentAddress(Address fulfillmentAddress) {
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

    public CheckoutSessionUpdateRequest fulfillmentOptionId(String fulfillmentOptionId) {
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

    /**
     * Create an instance of CheckoutSessionUpdateRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckoutSessionUpdateRequest
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     CheckoutSessionUpdateRequest
     */
    public static CheckoutSessionUpdateRequest fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, CheckoutSessionUpdateRequest.class);
    }

    /**
     * Convert an instance of CheckoutSessionUpdateRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
