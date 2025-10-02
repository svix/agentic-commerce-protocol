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
public class Error {
    @JsonProperty private ErrorType type;
    @JsonProperty private String code;
    @JsonProperty private String message;
    @JsonProperty private String param;

    public Error() {}

    public Error type(ErrorType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }

    public Error code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @javax.annotation.Nonnull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error param(String param) {
        this.param = param;
        return this;
    }

    /**
     * Get param
     *
     * @return param
     */
    @javax.annotation.Nullable
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    /**
     * Create an instance of Error given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Error
     * @throws JsonProcessingException if the JSON string is invalid with respect to Error
     */
    public static Error fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, Error.class);
    }

    /**
     * Convert an instance of Error to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
