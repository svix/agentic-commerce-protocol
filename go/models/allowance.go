// package agenticcommerce this file is @generated DO NOT EDIT
package models

type Allowance struct {
	Reason            AllowanceReason `json:"reason"`
	MaxAmount         int64           `json:"max_amount"`
	Currency          string          `json:"currency"`
	CheckoutSessionId string          `json:"checkout_session_id"`
	MerchantId        string          `json:"merchant_id"`
	ExpiresAt         string          `json:"expires_at"`
}
