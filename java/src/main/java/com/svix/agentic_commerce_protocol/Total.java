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
public class Total {
    @JsonProperty private TotalType type;

    @JsonProperty("display_text")
    private String displayText;

    @JsonProperty private Long amount;

    public Total() {}

    public Total type(TotalType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public TotalType getType() {
        return type;
    }

    public void setType(TotalType type) {
        this.type = type;
    }

    public Total displayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get displayText
     *
     * @return displayText
     */
    @javax.annotation.Nonnull
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public Total amount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @javax.annotation.Nonnull
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * Create an instance of Total given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Total
     * @throws JsonProcessingException if the JSON string is invalid with respect to Total
     */
    public static Total fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Total.class);
    }

    /**
     * Convert an instance of Total to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
