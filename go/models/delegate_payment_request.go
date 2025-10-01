// package agenticcommerce this file is @generated DO NOT EDIT
package models

type DelegatePaymentRequest struct {
	PaymentMethod  PaymentMethodCard `json:"payment_method"`
	Allowance      Allowance         `json:"allowance"`
	BillingAddress *Address          `json:"billing_address,omitempty"`
	RiskSignals    []RiskSignal      `json:"risk_signals"`
	Metadata       map[string]string `json:"metadata"`
}
