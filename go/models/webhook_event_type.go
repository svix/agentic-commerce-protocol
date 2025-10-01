// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type WebhookEventType string

const (
	WEBHOOKEVENTTYPE_ORDER_CREATE WebhookEventType = "order_create"
	WEBHOOKEVENTTYPE_ORDER_UPDATE WebhookEventType = "order_update"
)

var allowedWebhookEventType = []WebhookEventType{
	"order_create",
	"order_update",
}

func (v *WebhookEventType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := WebhookEventType(value)
	if slices.Contains(allowedWebhookEventType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid WebhookEventType", value)

}

var WebhookEventTypeFromString = map[string]WebhookEventType{
	"order_create": WEBHOOKEVENTTYPE_ORDER_CREATE,
	"order_update": WEBHOOKEVENTTYPE_ORDER_UPDATE,
}
