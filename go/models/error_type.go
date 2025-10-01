// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type ErrorType string

const (
	ERRORTYPE_INVALID_REQUEST        ErrorType = "invalid_request"
	ERRORTYPE_REQUEST_NOT_IDEMPOTENT ErrorType = "request_not_idempotent"
	ERRORTYPE_PROCESSING_ERROR       ErrorType = "processing_error"
	ERRORTYPE_SERVICE_UNAVAILABLE    ErrorType = "service_unavailable"
)

var allowedErrorType = []ErrorType{
	"invalid_request",
	"request_not_idempotent",
	"processing_error",
	"service_unavailable",
}

func (v *ErrorType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := ErrorType(value)
	if slices.Contains(allowedErrorType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid ErrorType", value)

}

var ErrorTypeFromString = map[string]ErrorType{
	"invalid_request":        ERRORTYPE_INVALID_REQUEST,
	"request_not_idempotent": ERRORTYPE_REQUEST_NOT_IDEMPOTENT,
	"processing_error":       ERRORTYPE_PROCESSING_ERROR,
	"service_unavailable":    ERRORTYPE_SERVICE_UNAVAILABLE,
}
