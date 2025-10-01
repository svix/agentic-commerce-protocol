// package agenticcommerce this file is @generated DO NOT EDIT
package models

type FulfillmentOptionShipping struct {
	Id                   string  `json:"id"`
	Title                string  `json:"title"`
	Subtitle             *string `json:"subtitle,omitempty"`
	Carrier              *string `json:"carrier,omitempty"`
	EarliestDeliveryTime *string `json:"earliest_delivery_time,omitempty"`
	LatestDeliveryTime   *string `json:"latest_delivery_time,omitempty"`
	Subtotal             int64   `json:"subtotal"`
	Tax                  int64   `json:"tax"`
	Total                int64   `json:"total"`
}
