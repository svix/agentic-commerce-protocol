// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type RiskSignalType string

const (
	RISKSIGNALTYPE_CARD_TESTING RiskSignalType = "card_testing"
)

var allowedRiskSignalType = []RiskSignalType{
	"card_testing",
}

func (v *RiskSignalType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := RiskSignalType(value)
	if slices.Contains(allowedRiskSignalType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid RiskSignalType", value)

}

var RiskSignalTypeFromString = map[string]RiskSignalType{
	"card_testing": RISKSIGNALTYPE_CARD_TESTING,
}
