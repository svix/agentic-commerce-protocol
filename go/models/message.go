// package agenticcommerce this file is @generated DO NOT EDIT
package models

import (
	"encoding/json"
	"fmt"
)

// When creating an Message, use the appropriate data structure based on the Type:
//   - "error": Use MessageError
//   - "info": Use MessageInfo
type Message struct {
	Type MessageType `json:"type"`
	Data MessageData `json:"data"`
}

type MessageType string

const (
	MessageTypeInfo  MessageType = "info"
	MessageTypeError MessageType = "error"
)

type MessageData interface {
	isMessageData()
}

func (MessageInfo) isMessageData()  {}
func (MessageError) isMessageData() {}

func (i *Message) UnmarshalJSON(data []byte) error {
	type Alias Message
	aux := struct {
		*Alias
		Data json.RawMessage `json:"data"`
	}{Alias: (*Alias)(i)}

	if err := json.Unmarshal(data, &aux); err != nil {
		return err
	}

	var err error
	switch i.Type {
	case "error":
		var c MessageError
		err = json.Unmarshal(aux.Data, &c)
		i.Data = c
	case "info":
		var c MessageInfo
		err = json.Unmarshal(aux.Data, &c)
		i.Data = c
	default:
		// should be unreachable
		return fmt.Errorf("unexpected type %s", i.Type)
	}
	return err
}

func (i Message) MarshalJSON() ([]byte, error) {
	type Alias Message
	return json.Marshal(&struct{ Alias }{Alias: (Alias)(i)})
}

var MessageTypeFromString = map[string]MessageType{
	"info":  MessageTypeInfo,
	"error": MessageTypeError,
}
