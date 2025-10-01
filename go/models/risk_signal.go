// package agenticcommerce this file is @generated DO NOT EDIT
package models

type RiskSignal struct {
	Type   RiskSignalType   `json:"type"`
	Score  int64            `json:"score"`
	Action RiskSignalAction `json:"action"`
}
