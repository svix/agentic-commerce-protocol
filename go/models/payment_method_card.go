// package agenticcommerce this file is @generated DO NOT EDIT
package models

type PaymentMethodCard struct {
	Type                   string               `json:"type"`
	CardNumberType         CardNumberType       `json:"card_number_type"`
	Number                 string               `json:"number"`
	ExpMonth               *string              `json:"exp_month,omitempty"`
	ExpYear                *string              `json:"exp_year,omitempty"`
	Name                   *string              `json:"name,omitempty"`
	Cvc                    *string              `json:"cvc,omitempty"`
	Cryptogram             *string              `json:"cryptogram,omitempty"`
	EciValue               *string              `json:"eci_value,omitempty"`
	ChecksPerformed        []CheckPerformedType `json:"checks_performed,omitempty"`
	Iin                    *string              `json:"iin,omitempty"`
	DisplayCardFundingType CardFundingType      `json:"display_card_funding_type"`
	DisplayWalletType      *string              `json:"display_wallet_type,omitempty"`
	DisplayBrand           *string              `json:"display_brand,omitempty"`
	DisplayLast4           *string              `json:"display_last4,omitempty"`
	Metadata               map[string]string    `json:"metadata"`
}
