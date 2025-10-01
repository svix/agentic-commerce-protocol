// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type CheckPerformedType string

const (
	CHECKPERFORMEDTYPE_AVS   CheckPerformedType = "avs"
	CHECKPERFORMEDTYPE_CVV   CheckPerformedType = "cvv"
	CHECKPERFORMEDTYPE_ANI   CheckPerformedType = "ani"
	CHECKPERFORMEDTYPE_AUTH0 CheckPerformedType = "auth0"
)

var allowedCheckPerformedType = []CheckPerformedType{
	"avs",
	"cvv",
	"ani",
	"auth0",
}

func (v *CheckPerformedType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := CheckPerformedType(value)
	if slices.Contains(allowedCheckPerformedType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid CheckPerformedType", value)

}

var CheckPerformedTypeFromString = map[string]CheckPerformedType{
	"avs":   CHECKPERFORMEDTYPE_AVS,
	"cvv":   CHECKPERFORMEDTYPE_CVV,
	"ani":   CHECKPERFORMEDTYPE_ANI,
	"auth0": CHECKPERFORMEDTYPE_AUTH0,
}
