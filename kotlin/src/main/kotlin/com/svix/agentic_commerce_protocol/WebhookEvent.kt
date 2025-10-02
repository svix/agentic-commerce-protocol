// This file is @generated
package com.svix.agentic_commerce_protocol

import kotlinx.serialization.Serializable

@Serializable data class WebhookEvent(val type: WebhookEventType, val data: EventDataOrder)
