// this file is @generated

export interface Order {
  id: string;
  checkoutSessionId: string;
  permalinkUrl: string;
}

export const OrderSerializer = {
  _fromJsonObject(object: any): Order {
    return {
      id: object["id"],
      checkoutSessionId: object["checkout_session_id"],
      permalinkUrl: object["permalink_url"],
    };
  },

  _toJsonObject(self: Order): any {
    return {
      id: self.id,
      checkout_session_id: self.checkoutSessionId,
      permalink_url: self.permalinkUrl,
    };
  },
};
