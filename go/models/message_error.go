// package agenticcommerce this file is @generated DO NOT EDIT
package models

type MessageError struct {
	Code        ErrorCode   `json:"code"`
	Param       *string     `json:"param,omitempty"`
	ContentType ContentType `json:"content_type"`
	Content     string      `json:"content"`
}
