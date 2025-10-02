// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.Serializable

@Serializable
data class RiskSignal(val type: RiskSignalType, val score: Long, val action: RiskSignalAction)
