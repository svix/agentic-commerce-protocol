// package agenticcommerce this file is @generated DO NOT EDIT
package models

type CheckoutSessionUpdateRequest struct {
	Buyer               *Buyer   `json:"buyer,omitempty"`
	Items               []Item   `json:"items,omitempty"`
	FulfillmentAddress  *Address `json:"fulfillment_address,omitempty"`
	FulfillmentOptionId *string  `json:"fulfillment_option_id,omitempty"`
}
