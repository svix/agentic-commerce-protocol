// this file is @generated

export enum WebhookEventType {
  OrderCreate = "order_create",
  OrderUpdate = "order_update",
}

export const WebhookEventTypeSerializer = {
  _fromJsonObject(object: any): WebhookEventType {
    return object;
  },

  _toJsonObject(self: WebhookEventType): any {
    return self;
  },
};
