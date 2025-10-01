// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type CheckoutSessionStatus string

const (
	CHECKOUTSESSIONSTATUS_NOT_READY_FOR_PAYMENT CheckoutSessionStatus = "not_ready_for_payment"
	CHECKOUTSESSIONSTATUS_READY_FOR_PAYMENT     CheckoutSessionStatus = "ready_for_payment"
	CHECKOUTSESSIONSTATUS_COMPLETED             CheckoutSessionStatus = "completed"
	CHECKOUTSESSIONSTATUS_CANCELED              CheckoutSessionStatus = "canceled"
	CHECKOUTSESSIONSTATUS_IN_PROGRESS           CheckoutSessionStatus = "in_progress"
)

var allowedCheckoutSessionStatus = []CheckoutSessionStatus{
	"not_ready_for_payment",
	"ready_for_payment",
	"completed",
	"canceled",
	"in_progress",
}

func (v *CheckoutSessionStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := CheckoutSessionStatus(value)
	if slices.Contains(allowedCheckoutSessionStatus, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid CheckoutSessionStatus", value)

}

var CheckoutSessionStatusFromString = map[string]CheckoutSessionStatus{
	"not_ready_for_payment": CHECKOUTSESSIONSTATUS_NOT_READY_FOR_PAYMENT,
	"ready_for_payment":     CHECKOUTSESSIONSTATUS_READY_FOR_PAYMENT,
	"completed":             CHECKOUTSESSIONSTATUS_COMPLETED,
	"canceled":              CHECKOUTSESSIONSTATUS_CANCELED,
	"in_progress":           CHECKOUTSESSIONSTATUS_IN_PROGRESS,
}
