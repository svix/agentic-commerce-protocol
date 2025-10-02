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
public class Address {
    @JsonProperty private String name;

    @JsonProperty("line_one")
    private String lineOne;

    @JsonProperty("line_two")
    private String lineTwo;

    @JsonProperty private String city;
    @JsonProperty private String state;
    @JsonProperty private String country;

    @JsonProperty("postal_code")
    private String postalCode;

    public Address() {}

    public Address name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address lineOne(String lineOne) {
        this.lineOne = lineOne;
        return this;
    }

    /**
     * Get lineOne
     *
     * @return lineOne
     */
    @javax.annotation.Nonnull
    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public Address lineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
        return this;
    }

    /**
     * Get lineTwo
     *
     * @return lineTwo
     */
    @javax.annotation.Nullable
    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     */
    @javax.annotation.Nonnull
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nonnull
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     */
    @javax.annotation.Nonnull
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     *
     * @return postalCode
     */
    @javax.annotation.Nonnull
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Create an instance of Address given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Address
     * @throws JsonProcessingException if the JSON string is invalid with respect to Address
     */
    public static Address fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Address.class);
    }

    /**
     * Convert an instance of Address to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
