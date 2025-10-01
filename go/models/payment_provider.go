// package agenticcommerce this file is @generated DO NOT EDIT
package models

type PaymentProvider struct {
	Provider                PaymentProviderType `json:"provider"`
	SupportedPaymentMethods []PaymentMethodType `json:"supported_payment_methods"`
}
