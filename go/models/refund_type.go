// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type RefundType string

const (
	REFUNDTYPE_STORE_CREDIT     RefundType = "store_credit"
	REFUNDTYPE_ORIGINAL_PAYMENT RefundType = "original_payment"
)

var allowedRefundType = []RefundType{
	"store_credit",
	"original_payment",
}

func (v *RefundType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := RefundType(value)
	if slices.Contains(allowedRefundType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid RefundType", value)

}

var RefundTypeFromString = map[string]RefundType{
	"store_credit":     REFUNDTYPE_STORE_CREDIT,
	"original_payment": REFUNDTYPE_ORIGINAL_PAYMENT,
}
