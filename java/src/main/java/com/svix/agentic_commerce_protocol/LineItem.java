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
public class LineItem {
    @JsonProperty private String id;
    @JsonProperty private Item item;

    @JsonProperty("base_amount")
    private Long baseAmount;

    @JsonProperty private Long discount;
    @JsonProperty private Long subtotal;
    @JsonProperty private Long tax;
    @JsonProperty private Long total;

    public LineItem() {}

    public LineItem id(String id) {
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

    public LineItem item(Item item) {
        this.item = item;
        return this;
    }

    /**
     * Get item
     *
     * @return item
     */
    @javax.annotation.Nonnull
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LineItem baseAmount(Long baseAmount) {
        this.baseAmount = baseAmount;
        return this;
    }

    /**
     * Get baseAmount
     *
     * @return baseAmount
     */
    @javax.annotation.Nonnull
    public Long getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Long baseAmount) {
        this.baseAmount = baseAmount;
    }

    public LineItem discount(Long discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Get discount
     *
     * @return discount
     */
    @javax.annotation.Nonnull
    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public LineItem subtotal(Long subtotal) {
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

    public LineItem tax(Long tax) {
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

    public LineItem total(Long total) {
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
     * Create an instance of LineItem given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LineItem
     * @throws JsonProcessingException if the JSON string is invalid with respect to LineItem
     */
    public static LineItem fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, LineItem.class);
    }

    /**
     * Convert an instance of LineItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
