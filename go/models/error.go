// package agenticcommerce this file is @generated DO NOT EDIT
package models

type Error struct {
	Type    ErrorType `json:"type"`
	Code    string    `json:"code"`
	Message string    `json:"message"`
	Param   *string   `json:"param,omitempty"`
}
