// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type TotalType string

const (
	TOTALTYPE_ITEMS_BASE_AMOUNT TotalType = "items_base_amount"
	TOTALTYPE_ITEMS_DISCOUNT    TotalType = "items_discount"
	TOTALTYPE_SUBTOTAL          TotalType = "subtotal"
	TOTALTYPE_DISCOUNT          TotalType = "discount"
	TOTALTYPE_FULFILLMENT       TotalType = "fulfillment"
	TOTALTYPE_TAX               TotalType = "tax"
	TOTALTYPE_FEE               TotalType = "fee"
	TOTALTYPE_TOTAL             TotalType = "total"
)

var allowedTotalType = []TotalType{
	"items_base_amount",
	"items_discount",
	"subtotal",
	"discount",
	"fulfillment",
	"tax",
	"fee",
	"total",
}

func (v *TotalType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := TotalType(value)
	if slices.Contains(allowedTotalType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid TotalType", value)

}

var TotalTypeFromString = map[string]TotalType{
	"items_base_amount": TOTALTYPE_ITEMS_BASE_AMOUNT,
	"items_discount":    TOTALTYPE_ITEMS_DISCOUNT,
	"subtotal":          TOTALTYPE_SUBTOTAL,
	"discount":          TOTALTYPE_DISCOUNT,
	"fulfillment":       TOTALTYPE_FULFILLMENT,
	"tax":               TOTALTYPE_TAX,
	"fee":               TOTALTYPE_FEE,
	"total":             TOTALTYPE_TOTAL,
}
