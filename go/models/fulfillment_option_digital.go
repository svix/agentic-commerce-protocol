// package agenticcommerce this file is @generated DO NOT EDIT
package models

type FulfillmentOptionDigital struct {
	Id       string  `json:"id"`
	Title    string  `json:"title"`
	Subtitle *string `json:"subtitle,omitempty"`
	Subtotal int64   `json:"subtotal"`
	Tax      int64   `json:"tax"`
	Total    int64   `json:"total"`
}
