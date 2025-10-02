// This file is @generated
package com.svix.agentic_commerce_protocol;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DelegatePaymentResponse {
    @JsonProperty private String id;
    @JsonProperty private String created;
    @JsonProperty private Map<String, String> metadata;

    public DelegatePaymentResponse() {}

    public DelegatePaymentResponse id(String id) {
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

    public DelegatePaymentResponse created(String created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     *
     * @return created
     */
    @javax.annotation.Nonnull
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public DelegatePaymentResponse metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DelegatePaymentResponse putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);

        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Create an instance of DelegatePaymentResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DelegatePaymentResponse
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     DelegatePaymentResponse
     */
    public static DelegatePaymentResponse fromJson(String jsonString)
            throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, DelegatePaymentResponse.class);
    }

    /**
     * Convert an instance of DelegatePaymentResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
