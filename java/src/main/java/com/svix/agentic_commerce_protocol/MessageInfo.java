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
public class MessageInfo {
    @JsonProperty private String param;

    @JsonProperty("content_type")
    private ContentType contentType;

    @JsonProperty private String content;

    public MessageInfo() {}

    public MessageInfo param(String param) {
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

    public MessageInfo contentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     *
     * @return contentType
     */
    @javax.annotation.Nonnull
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public MessageInfo content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     */
    @javax.annotation.Nonnull
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Create an instance of MessageInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MessageInfo
     * @throws JsonProcessingException if the JSON string is invalid with respect to MessageInfo
     */
    public static MessageInfo fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, MessageInfo.class);
    }

    /**
     * Convert an instance of MessageInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
