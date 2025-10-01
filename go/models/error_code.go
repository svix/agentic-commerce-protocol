// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type ErrorCode string

const (
	ERRORCODE_MISSING          ErrorCode = "missing"
	ERRORCODE_INVALID          ErrorCode = "invalid"
	ERRORCODE_OUT_OF_STOCK     ErrorCode = "out_of_stock"
	ERRORCODE_PAYMENT_DECLINED ErrorCode = "payment_declined"
	ERRORCODE_REQUIRES_SIGN_IN ErrorCode = "requires_sign_in"
	ERRORCODE_REQUIRES_3DS     ErrorCode = "requires_3ds"
)

var allowedErrorCode = []ErrorCode{
	"missing",
	"invalid",
	"out_of_stock",
	"payment_declined",
	"requires_sign_in",
	"requires_3ds",
}

func (v *ErrorCode) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := ErrorCode(value)
	if slices.Contains(allowedErrorCode, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid ErrorCode", value)

}

var ErrorCodeFromString = map[string]ErrorCode{
	"missing":          ERRORCODE_MISSING,
	"invalid":          ERRORCODE_INVALID,
	"out_of_stock":     ERRORCODE_OUT_OF_STOCK,
	"payment_declined": ERRORCODE_PAYMENT_DECLINED,
	"requires_sign_in": ERRORCODE_REQUIRES_SIGN_IN,
	"requires_3ds":     ERRORCODE_REQUIRES_3DS,
}
