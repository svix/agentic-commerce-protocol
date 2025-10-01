// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type RiskSignalAction string

const (
	RISKSIGNALACTION_BLOCKED       RiskSignalAction = "blocked"
	RISKSIGNALACTION_MANUAL_REVIEW RiskSignalAction = "manual_review"
	RISKSIGNALACTION_AUTHORIZED    RiskSignalAction = "authorized"
)

var allowedRiskSignalAction = []RiskSignalAction{
	"blocked",
	"manual_review",
	"authorized",
}

func (v *RiskSignalAction) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := RiskSignalAction(value)
	if slices.Contains(allowedRiskSignalAction, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid RiskSignalAction", value)

}

var RiskSignalActionFromString = map[string]RiskSignalAction{
	"blocked":       RISKSIGNALACTION_BLOCKED,
	"manual_review": RISKSIGNALACTION_MANUAL_REVIEW,
	"authorized":    RISKSIGNALACTION_AUTHORIZED,
}
