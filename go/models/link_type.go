// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
	"slices"
)

type LinkType string

const (
	LINKTYPE_TERMS_OF_USE         LinkType = "terms_of_use"
	LINKTYPE_PRIVACY_POLICY       LinkType = "privacy_policy"
	LINKTYPE_SELLER_SHOP_POLICIES LinkType = "seller_shop_policies"
)

var allowedLinkType = []LinkType{
	"terms_of_use",
	"privacy_policy",
	"seller_shop_policies",
}

func (v *LinkType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumVal := LinkType(value)
	if slices.Contains(allowedLinkType, enumVal) {
		*v = enumVal
		return nil
	}
	return fmt.Errorf("`%+v` is not a valid LinkType", value)

}

var LinkTypeFromString = map[string]LinkType{
	"terms_of_use":         LINKTYPE_TERMS_OF_USE,
	"privacy_policy":       LINKTYPE_PRIVACY_POLICY,
	"seller_shop_policies": LINKTYPE_SELLER_SHOP_POLICIES,
}
