// this file is @generated
import { type Refund, RefundSerializer } from "./refund";
import {
  type WebhookOrderStatus,
  WebhookOrderStatusSerializer,
} from "./webhookOrderStatus";

export interface EventDataOrder {
  type: string;
  checkoutSessionId: string;
  permalinkUrl: string;
  status: WebhookOrderStatus;
  refunds: Refund[];
}

export const EventDataOrderSerializer = {
  _fromJsonObject(object: any): EventDataOrder {
    return {
      type: object["type"],
      checkoutSessionId: object["checkout_session_id"],
      permalinkUrl: object["permalink_url"],
      status: WebhookOrderStatusSerializer._fromJsonObject(object["status"]),
      refunds: object["refunds"].map((item: Refund) =>
        RefundSerializer._fromJsonObject(item)
      ),
    };
  },

  _toJsonObject(self: EventDataOrder): any {
    return {
      type: self.type,
      checkout_session_id: self.checkoutSessionId,
      permalink_url: self.permalinkUrl,
      status: WebhookOrderStatusSerializer._toJsonObject(self.status),
      refunds: self.refunds.map((item) => RefundSerializer._toJsonObject(item)),
    };
  },
};
