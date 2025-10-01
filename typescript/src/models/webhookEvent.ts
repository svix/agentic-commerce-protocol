// this file is @generated
import { type EventDataOrder, EventDataOrderSerializer } from "./eventDataOrder";
import { type WebhookEventType, WebhookEventTypeSerializer } from "./webhookEventType";

export interface WebhookEvent {
  type: WebhookEventType;
  data: EventDataOrder;
}

export const WebhookEventSerializer = {
  _fromJsonObject(object: any): WebhookEvent {
    return {
      type: WebhookEventTypeSerializer._fromJsonObject(object["type"]),
      data: EventDataOrderSerializer._fromJsonObject(object["data"]),
    };
  },

  _toJsonObject(self: WebhookEvent): any {
    return {
      type: WebhookEventTypeSerializer._toJsonObject(self.type),
      data: EventDataOrderSerializer._toJsonObject(self.data),
    };
  },
};
