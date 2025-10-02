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
public class FulfillmentOptionShipping {
    @JsonProperty private String id;
    @JsonProperty private String title;
    @JsonProperty private String subtitle;
    @JsonProperty private String carrier;

    @JsonProperty("earliest_delivery_time")
    private String earliestDeliveryTime;

    @JsonProperty("latest_delivery_time")
    private String latestDeliveryTime;

    @JsonProperty private Long subtotal;
    @JsonProperty private Long tax;
    @JsonProperty private Long total;

    public FulfillmentOptionShipping() {}

    public FulfillmentOptionShipping id(String id) {
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

    public FulfillmentOptionShipping title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */
    @javax.annotation.Nonnull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FulfillmentOptionShipping subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * Get subtitle
     *
     * @return subtitle
     */
    @javax.annotation.Nullable
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public FulfillmentOptionShipping carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * Get carrier
     *
     * @return carrier
     */
    @javax.annotation.Nullable
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public FulfillmentOptionShipping earliestDeliveryTime(String earliestDeliveryTime) {
        this.earliestDeliveryTime = earliestDeliveryTime;
        return this;
    }

    /**
     * Get earliestDeliveryTime
     *
     * @return earliestDeliveryTime
     */
    @javax.annotation.Nullable
    public String getEarliestDeliveryTime() {
        return earliestDeliveryTime;
    }

    public void setEarliestDeliveryTime(String earliestDeliveryTime) {
        this.earliestDeliveryTime = earliestDeliveryTime;
    }

    public FulfillmentOptionShipping latestDeliveryTime(String latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
        return this;
    }

    /**
     * Get latestDeliveryTime
     *
     * @return latestDeliveryTime
     */
    @javax.annotation.Nullable
    public String getLatestDeliveryTime() {
        return latestDeliveryTime;
    }

    public void setLatestDeliveryTime(String latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
    }

    public FulfillmentOptionShipping subtotal(Long subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    /**
     * Get subtotal
     *
     * @return subtotal
     */
    @javax.annotation.Nonnull
    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public FulfillmentOptionShipping tax(Long tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Get tax
     *
     * @return tax
     */
    @javax.annotation.Nonnull
    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public FulfillmentOptionShipping total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     */
    @javax.annotation.Nonnull
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * Create an instance of FulfillmentOptionShipping given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FulfillmentOptionShipping
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     FulfillmentOptionShipping
     */
    public static FulfillmentOptionShipping fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, FulfillmentOptionShipping.class);
    }

    /**
     * Convert an instance of FulfillmentOptionShipping to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
