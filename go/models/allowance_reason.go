// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type AllowanceReason string

const (
	ALLOWANCEREASON_ONE_TIME AllowanceReason = "one_time"
)

var allowedAllowanceReason = []AllowanceReason{
	"one_time",
}

func (v *AllowanceReason) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := AllowanceReason(value)
	if slices.Contains(allowedAllowanceReason, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid AllowanceReason", value)

}

var AllowanceReasonFromString = map[string]AllowanceReason{
	"one_time": ALLOWANCEREASON_ONE_TIME,
}
