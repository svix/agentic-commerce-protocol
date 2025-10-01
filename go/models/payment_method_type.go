// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type PaymentMethodType string

const (
	PAYMENTMETHODTYPE_CARD PaymentMethodType = "card"
)

var allowedPaymentMethodType = []PaymentMethodType{
	"card",
}

func (v *PaymentMethodType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := PaymentMethodType(value)
	if slices.Contains(allowedPaymentMethodType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid PaymentMethodType", value)

}

var PaymentMethodTypeFromString = map[string]PaymentMethodType{
	"card": PAYMENTMETHODTYPE_CARD,
}
