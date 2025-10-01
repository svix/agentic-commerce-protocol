// package agenticcommerce this file is @generated DO NOT EDIT
package models

type EventDataOrder struct {
	Type              string             `json:"type"`
	CheckoutSessionId string             `json:"checkout_session_id"`
	PermalinkUrl      string             `json:"permalink_url"`
	Status            WebhookOrderStatus `json:"status"`
	Refunds           []Refund           `json:"refunds"`
}
