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
public class RiskSignal {
    @JsonProperty private RiskSignalType type;
    @JsonProperty private Long score;
    @JsonProperty private RiskSignalAction action;

    public RiskSignal() {}

    public RiskSignal type(RiskSignalType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public RiskSignalType getType() {
        return type;
    }

    public void setType(RiskSignalType type) {
        this.type = type;
    }

    public RiskSignal score(Long score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     *
     * @return score
     */
    @javax.annotation.Nonnull
    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public RiskSignal action(RiskSignalAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @javax.annotation.Nonnull
    public RiskSignalAction getAction() {
        return action;
    }

    public void setAction(RiskSignalAction action) {
        this.action = action;
    }

    /**
     * Create an instance of RiskSignal given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RiskSignal
     * @throws JsonProcessingException if the JSON string is invalid with respect to RiskSignal
     */
    public static RiskSignal fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, RiskSignal.class);
    }

    /**
     * Convert an instance of RiskSignal to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
