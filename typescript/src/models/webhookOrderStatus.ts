// this file is @generated

export enum WebhookOrderStatus {
  Created = "created",
  ManualReview = "manual_review",
  Confirmed = "confirmed",
  Canceled = "canceled",
  Shipped = "shipped",
  Fulfilled = "fulfilled",
}

export const WebhookOrderStatusSerializer = {
  _fromJsonObject(object: any): WebhookOrderStatus {
    return object;
  },

  _toJsonObject(self: WebhookOrderStatus): any {
    return self;
  },
};
