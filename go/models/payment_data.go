// package agenticcommerce this file is @generated DO NOT EDIT
package models

type PaymentData struct {
	Token          string              `json:"token"`
	Provider       PaymentProviderType `json:"provider"`
	BillingAddress *Address            `json:"billing_address,omitempty"`
}
