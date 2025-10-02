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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PaymentMethodCard {
    @JsonProperty private String type;

    @JsonProperty("card_number_type")
    private CardNumberType cardNumberType;

    @JsonProperty private String number;

    @JsonProperty("exp_month")
    private String expMonth;

    @JsonProperty("exp_year")
    private String expYear;

    @JsonProperty private String name;
    @JsonProperty private String cvc;
    @JsonProperty private String cryptogram;

    @JsonProperty("eci_value")
    private String eciValue;

    @JsonProperty("checks_performed")
    private List<CheckPerformedType> checksPerformed;

    @JsonProperty private String iin;

    @JsonProperty("display_card_funding_type")
    private CardFundingType displayCardFundingType;

    @JsonProperty("display_wallet_type")
    private String displayWalletType;

    @JsonProperty("display_brand")
    private String displayBrand;

    @JsonProperty("display_last4")
    private String displayLast4;

    @JsonProperty private Map<String, String> metadata;

    public PaymentMethodCard() {}

    public PaymentMethodCard type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PaymentMethodCard cardNumberType(CardNumberType cardNumberType) {
        this.cardNumberType = cardNumberType;
        return this;
    }

    /**
     * Get cardNumberType
     *
     * @return cardNumberType
     */
    @javax.annotation.Nonnull
    public CardNumberType getCardNumberType() {
        return cardNumberType;
    }

    public void setCardNumberType(CardNumberType cardNumberType) {
        this.cardNumberType = cardNumberType;
    }

    public PaymentMethodCard number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     *
     * @return number
     */
    @javax.annotation.Nonnull
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PaymentMethodCard expMonth(String expMonth) {
        this.expMonth = expMonth;
        return this;
    }

    /**
     * Get expMonth
     *
     * @return expMonth
     */
    @javax.annotation.Nullable
    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public PaymentMethodCard expYear(String expYear) {
        this.expYear = expYear;
        return this;
    }

    /**
     * Get expYear
     *
     * @return expYear
     */
    @javax.annotation.Nullable
    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    public PaymentMethodCard name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentMethodCard cvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    /**
     * Get cvc
     *
     * @return cvc
     */
    @javax.annotation.Nullable
    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public PaymentMethodCard cryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
        return this;
    }

    /**
     * Get cryptogram
     *
     * @return cryptogram
     */
    @javax.annotation.Nullable
    public String getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    public PaymentMethodCard eciValue(String eciValue) {
        this.eciValue = eciValue;
        return this;
    }

    /**
     * Get eciValue
     *
     * @return eciValue
     */
    @javax.annotation.Nullable
    public String getEciValue() {
        return eciValue;
    }

    public void setEciValue(String eciValue) {
        this.eciValue = eciValue;
    }

    public PaymentMethodCard checksPerformed(List<CheckPerformedType> checksPerformed) {
        this.checksPerformed = checksPerformed;
        return this;
    }

    public PaymentMethodCard addChecksPerformedItem(CheckPerformedType checksPerformedItem) {
        if (this.checksPerformed == null) {
            this.checksPerformed = new ArrayList<>();
        }
        this.checksPerformed.add(checksPerformedItem);

        return this;
    }

    /**
     * Get checksPerformed
     *
     * @return checksPerformed
     */
    @javax.annotation.Nullable
    public List<CheckPerformedType> getChecksPerformed() {
        return checksPerformed;
    }

    public void setChecksPerformed(List<CheckPerformedType> checksPerformed) {
        this.checksPerformed = checksPerformed;
    }

    public PaymentMethodCard iin(String iin) {
        this.iin = iin;
        return this;
    }

    /**
     * Get iin
     *
     * @return iin
     */
    @javax.annotation.Nullable
    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public PaymentMethodCard displayCardFundingType(CardFundingType displayCardFundingType) {
        this.displayCardFundingType = displayCardFundingType;
        return this;
    }

    /**
     * Get displayCardFundingType
     *
     * @return displayCardFundingType
     */
    @javax.annotation.Nonnull
    public CardFundingType getDisplayCardFundingType() {
        return displayCardFundingType;
    }

    public void setDisplayCardFundingType(CardFundingType displayCardFundingType) {
        this.displayCardFundingType = displayCardFundingType;
    }

    public PaymentMethodCard displayWalletType(String displayWalletType) {
        this.displayWalletType = displayWalletType;
        return this;
    }

    /**
     * Get displayWalletType
     *
     * @return displayWalletType
     */
    @javax.annotation.Nullable
    public String getDisplayWalletType() {
        return displayWalletType;
    }

    public void setDisplayWalletType(String displayWalletType) {
        this.displayWalletType = displayWalletType;
    }

    public PaymentMethodCard displayBrand(String displayBrand) {
        this.displayBrand = displayBrand;
        return this;
    }

    /**
     * Get displayBrand
     *
     * @return displayBrand
     */
    @javax.annotation.Nullable
    public String getDisplayBrand() {
        return displayBrand;
    }

    public void setDisplayBrand(String displayBrand) {
        this.displayBrand = displayBrand;
    }

    public PaymentMethodCard displayLast4(String displayLast4) {
        this.displayLast4 = displayLast4;
        return this;
    }

    /**
     * Get displayLast4
     *
     * @return displayLast4
     */
    @javax.annotation.Nullable
    public String getDisplayLast4() {
        return displayLast4;
    }

    public void setDisplayLast4(String displayLast4) {
        this.displayLast4 = displayLast4;
    }

    public PaymentMethodCard metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PaymentMethodCard putMetadataItem(String key, String metadataItem) {
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
     * Create an instance of PaymentMethodCard given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PaymentMethodCard
     * @throws JsonProcessingException if the JSON string is invalid with respect to
     *     PaymentMethodCard
     */
    public static PaymentMethodCard fromJson(String jsonString) throws JsonProcessingException {
        return Utils.getObjectMapper().readValue(jsonString, PaymentMethodCard.class);
    }

    /**
     * Convert an instance of PaymentMethodCard to an JSON string
     *
     * @return JSON string
     */
    public String toJson() throws JsonProcessingException {
        return Utils.getObjectMapper().writeValueAsString(this);
    }
}
