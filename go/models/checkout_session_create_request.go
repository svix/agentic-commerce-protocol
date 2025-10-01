// package agenticcommerce this file is @generated DO NOT EDIT
package models

type CheckoutSessionCreateRequest struct {
	Buyer              *Buyer   `json:"buyer,omitempty"`
	Items              []Item   `json:"items"`
	FulfillmentAddress *Address `json:"fulfillment_address,omitempty"`
}
