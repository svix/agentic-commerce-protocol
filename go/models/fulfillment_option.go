// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
)

// When creating an FulfillmentOption, use the appropriate data structure based on the Type:
//   - "digital": Use FulfillmentOptionDigital
//   - "shipping": Use FulfillmentOptionShipping
type FulfillmentOption struct {
	Type FulfillmentOptionType `json:"type"`
	Data FulfillmentOptionData `json:"data"`
}

type FulfillmentOptionType string

const (
	FulfillmentOptionTypeShipping FulfillmentOptionType = "shipping"
	FulfillmentOptionTypeDigital  FulfillmentOptionType = "digital"
)

type FulfillmentOptionData interface {
	isFulfillmentOptionData()
}

func (FulfillmentOptionShipping) isFulfillmentOptionData() {}
func (FulfillmentOptionDigital) isFulfillmentOptionData()  {}

func (i *FulfillmentOption) UnmarshalJSON(data []byte) error {
	type Alias FulfillmentOption
	aux := struct {
		*Alias
		Data json.RawMessage `json:"data"`
	}{Alias: (*Alias)(i)}

	if err := json.Unmarshal(data, &aux); err != nil {
		return err
	}

	var err error
	switch i.Type {
	case "digital":
		var c FulfillmentOptionDigital
		err = json.Unmarshal(aux.Data, &c)
		i.Data = c
	case "shipping":
		var c FulfillmentOptionShipping
		err = json.Unmarshal(aux.Data, &c)
		i.Data = c
	default:
		// should be unreachable
		return fmt.Errorf("unexpected type %s", i.Type)
	}
	return err
}

func (i FulfillmentOption) MarshalJSON() ([]byte, error) {
	type Alias FulfillmentOption
	return json.Marshal(&struct{ Alias }{Alias: (Alias)(i)})
}

var FulfillmentOptionTypeFromString = map[string]FulfillmentOptionType{
	"shipping": FulfillmentOptionTypeShipping,
	"digital":  FulfillmentOptionTypeDigital,
}
