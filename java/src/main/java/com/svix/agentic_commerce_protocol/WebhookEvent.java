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
public class WebhookEvent {
    @JsonProperty private WebhookEventType type;
    @JsonProperty private EventDataOrder data;

    public WebhookEvent() {}

    public WebhookEvent type(WebhookEventType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public WebhookEventType getType() {
        return type;
    }

    public void setType(WebhookEventType type) {
        this.type = type;
    }

    public WebhookEvent data(EventDataOrder data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    public EventDataOrder getData() {
        return data;
    }

    public void setData(EventDataOrder data) {
        this.data = data;
    }

    /**
     * Create an instance of WebhookEvent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookEvent
     * @throws JsonProcessingException if the JSON string is invalid with respect to WebhookEvent
     */
    public static WebhookEvent fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, WebhookEvent.class);
    }

    /**
     * Convert an instance of WebhookEvent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
