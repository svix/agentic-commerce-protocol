// package agenticcommerce this file is @generated DO NOT EDIT
package models

type Buyer struct {
	FirstName   string  `json:"first_name"`
	LastName    string  `json:"last_name"`
	Email       string  `json:"email"`
	PhoneNumber *string `json:"phone_number,omitempty"`
}
