// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type ContentType string

const (
	CONTENTTYPE_PLAIN    ContentType = "plain"
	CONTENTTYPE_MARKDOWN ContentType = "markdown"
)

var allowedContentType = []ContentType{
	"plain",
	"markdown",
}

func (v *ContentType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := ContentType(value)
	if slices.Contains(allowedContentType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid ContentType", value)

}

var ContentTypeFromString = map[string]ContentType{
	"plain":    CONTENTTYPE_PLAIN,
	"markdown": CONTENTTYPE_MARKDOWN,
}
