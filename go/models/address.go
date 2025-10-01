// package agenticcommerce this file is @generated DO NOT EDIT
package models

type Address struct {
	Name       string  `json:"name"`
	LineOne    string  `json:"line_one"`
	LineTwo    *string `json:"line_two,omitempty"`
	City       string  `json:"city"`
	State      string  `json:"state"`
	Country    string  `json:"country"`
	PostalCode string  `json:"postal_code"`
}
