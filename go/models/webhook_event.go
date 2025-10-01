// package agenticcommerce this file is @generated DO NOT EDIT
package models

type WebhookEvent struct {
	Type WebhookEventType `json:"type"`
	Data EventDataOrder   `json:"data"`
}
