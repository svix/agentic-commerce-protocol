// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type CardNumberType string

const (
	CARDNUMBERTYPE_FPAN          CardNumberType = "fpan"
	CARDNUMBERTYPE_NETWORK_TOKEN CardNumberType = "network_token"
)

var allowedCardNumberType = []CardNumberType{
	"fpan",
	"network_token",
}

func (v *CardNumberType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := CardNumberType(value)
	if slices.Contains(allowedCardNumberType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid CardNumberType", value)

}

var CardNumberTypeFromString = map[string]CardNumberType{
	"fpan":          CARDNUMBERTYPE_FPAN,
	"network_token": CARDNUMBERTYPE_NETWORK_TOKEN,
}
