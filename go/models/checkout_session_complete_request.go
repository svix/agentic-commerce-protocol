// package agenticcommerce this file is @generated DO NOT EDIT
package models

type CheckoutSessionCompleteRequest struct {
	Buyer       *Buyer      `json:"buyer,omitempty"`
	PaymentData PaymentData `json:"payment_data"`
}
