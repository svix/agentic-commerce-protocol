// this file is @generated
import { type Address, AddressSerializer } from "./address";
import { type Buyer, BuyerSerializer } from "./buyer";
import {
  type CheckoutSessionStatus,
  CheckoutSessionStatusSerializer,
} from "./checkoutSessionStatus";
import { type FulfillmentOption, FulfillmentOptionSerializer } from "./fulfillmentOption";
import { type LineItem, LineItemSerializer } from "./lineItem";
import { type Link, LinkSerializer } from "./link";
import { type Message, MessageSerializer } from "./message";
import { type Order, OrderSerializer } from "./order";
import { type PaymentProvider, PaymentProviderSerializer } from "./paymentProvider";
import { type Total, TotalSerializer } from "./total";

export interface CheckoutSession {
  id: string;
  buyer?: Buyer | null;
  paymentProvider?: PaymentProvider | null;
  status: CheckoutSessionStatus;
  currency: string;
  lineItems: LineItem[];
  fulfillmentAddress?: Address | null;
  fulfillmentOptions: FulfillmentOption[];
  fulfillmentOptionId?: string | null;
  totals: Total[];
  messages: Message[];
  links: Link[];
  order?: Order | null;
}

export const CheckoutSessionSerializer = {
  _fromJsonObject(object: any): CheckoutSession {
    return {
      id: object["id"],
      buyer: object["buyer"]
        ? BuyerSerializer._fromJsonObject(object["buyer"])
        : undefined,
      paymentProvider: object["payment_provider"]
        ? PaymentProviderSerializer._fromJsonObject(object["payment_provider"])
        : undefined,
      status: CheckoutSessionStatusSerializer._fromJsonObject(object["status"]),
      currency: object["currency"],
      lineItems: object["line_items"].map((item: LineItem) =>
        LineItemSerializer._fromJsonObject(item)
      ),
      fulfillmentAddress: object["fulfillment_address"]
        ? AddressSerializer._fromJsonObject(object["fulfillment_address"])
        : undefined,
      fulfillmentOptions: object["fulfillment_options"].map((item: FulfillmentOption) =>
        FulfillmentOptionSerializer._fromJsonObject(item)
      ),
      fulfillmentOptionId: object["fulfillment_option_id"],
      totals: object["totals"].map((item: Total) =>
        TotalSerializer._fromJsonObject(item)
      ),
      messages: object["messages"].map((item: Message) =>
        MessageSerializer._fromJsonObject(item)
      ),
      links: object["links"].map((item: Link) => LinkSerializer._fromJsonObject(item)),
      order: object["order"]
        ? OrderSerializer._fromJsonObject(object["order"])
        : undefined,
    };
  },

  _toJsonObject(self: CheckoutSession): any {
    return {
      id: self.id,
      buyer: self.buyer ? BuyerSerializer._toJsonObject(self.buyer) : undefined,
      payment_provider: self.paymentProvider
        ? PaymentProviderSerializer._toJsonObject(self.paymentProvider)
        : undefined,
      status: CheckoutSessionStatusSerializer._toJsonObject(self.status),
      currency: self.currency,
      line_items: self.lineItems.map((item) => LineItemSerializer._toJsonObject(item)),
      fulfillment_address: self.fulfillmentAddress
        ? AddressSerializer._toJsonObject(self.fulfillmentAddress)
        : undefined,
      fulfillment_options: self.fulfillmentOptions.map((item) =>
        FulfillmentOptionSerializer._toJsonObject(item)
      ),
      fulfillment_option_id: self.fulfillmentOptionId,
      totals: self.totals.map((item) => TotalSerializer._toJsonObject(item)),
      messages: self.messages.map((item) => MessageSerializer._toJsonObject(item)),
      links: self.links.map((item) => LinkSerializer._toJsonObject(item)),
      order: self.order ? OrderSerializer._toJsonObject(self.order) : undefined,
    };
  },
};
