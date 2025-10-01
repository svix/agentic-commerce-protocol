// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type WebhookOrderStatus string

const (
	WEBHOOKORDERSTATUS_CREATED       WebhookOrderStatus = "created"
	WEBHOOKORDERSTATUS_MANUAL_REVIEW WebhookOrderStatus = "manual_review"
	WEBHOOKORDERSTATUS_CONFIRMED     WebhookOrderStatus = "confirmed"
	WEBHOOKORDERSTATUS_CANCELED      WebhookOrderStatus = "canceled"
	WEBHOOKORDERSTATUS_SHIPPED       WebhookOrderStatus = "shipped"
	WEBHOOKORDERSTATUS_FULFILLED     WebhookOrderStatus = "fulfilled"
)

var allowedWebhookOrderStatus = []WebhookOrderStatus{
	"created",
	"manual_review",
	"confirmed",
	"canceled",
	"shipped",
	"fulfilled",
}

func (v *WebhookOrderStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := WebhookOrderStatus(value)
	if slices.Contains(allowedWebhookOrderStatus, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid WebhookOrderStatus", value)

}

var WebhookOrderStatusFromString = map[string]WebhookOrderStatus{
	"created":       WEBHOOKORDERSTATUS_CREATED,
	"manual_review": WEBHOOKORDERSTATUS_MANUAL_REVIEW,
	"confirmed":     WEBHOOKORDERSTATUS_CONFIRMED,
	"canceled":      WEBHOOKORDERSTATUS_CANCELED,
	"shipped":       WEBHOOKORDERSTATUS_SHIPPED,
	"fulfilled":     WEBHOOKORDERSTATUS_FULFILLED,
}
