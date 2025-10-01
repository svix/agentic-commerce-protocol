// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type PaymentProviderType string

const (
	PAYMENTPROVIDERTYPE_STRIPE PaymentProviderType = "stripe"
)

var allowedPaymentProviderType = []PaymentProviderType{
	"stripe",
}

func (v *PaymentProviderType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := PaymentProviderType(value)
	if slices.Contains(allowedPaymentProviderType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid PaymentProviderType", value)

}

var PaymentProviderTypeFromString = map[string]PaymentProviderType{
	"stripe": PAYMENTPROVIDERTYPE_STRIPE,
}
