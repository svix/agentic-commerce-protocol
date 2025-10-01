// package agenticcommerce this file is @generated DO NOT EDIT
package models

type LineItem struct {
	Id         string `json:"id"`
	Item       Item   `json:"item"`
	BaseAmount int64  `json:"base_amount"`
	Discount   int64  `json:"discount"`
	Subtotal   int64  `json:"subtotal"`
	Tax        int64  `json:"tax"`
	Total      int64  `json:"total"`
}
