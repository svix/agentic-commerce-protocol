// package agenticcommerce this file is @generated DO NOT EDIT
package models

type CheckoutSession struct {
	Id                  string                `json:"id"`
	Buyer               *Buyer                `json:"buyer,omitempty"`
	PaymentProvider     *PaymentProvider      `json:"payment_provider,omitempty"`
	Status              CheckoutSessionStatus `json:"status"`
	Currency            string                `json:"currency"`
	LineItems           []LineItem            `json:"line_items"`
	FulfillmentAddress  *Address              `json:"fulfillment_address,omitempty"`
	FulfillmentOptions  []FulfillmentOption   `json:"fulfillment_options"`
	FulfillmentOptionId *string               `json:"fulfillment_option_id,omitempty"`
	Totals              []Total               `json:"totals"`
	Messages            []Message             `json:"messages"`
	Links               []Link                `json:"links"`
	Order               *Order                `json:"order,omitempty"`
}
