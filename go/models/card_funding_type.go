// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type CardFundingType string

const (
	CARDFUNDINGTYPE_CREDIT  CardFundingType = "credit"
	CARDFUNDINGTYPE_DEBIT   CardFundingType = "debit"
	CARDFUNDINGTYPE_PREPAID CardFundingType = "prepaid"
)

var allowedCardFundingType = []CardFundingType{
	"credit",
	"debit",
	"prepaid",
}

func (v *CardFundingType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := CardFundingType(value)
	if slices.Contains(allowedCardFundingType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid CardFundingType", value)

}

var CardFundingTypeFromString = map[string]CardFundingType{
	"credit":  CARDFUNDINGTYPE_CREDIT,
	"debit":   CARDFUNDINGTYPE_DEBIT,
	"prepaid": CARDFUNDINGTYPE_PREPAID,
}
