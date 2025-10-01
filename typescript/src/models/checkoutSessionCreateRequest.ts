// this file is @generated
import { type Address, AddressSerializer } from "./address";
import { type Buyer, BuyerSerializer } from "./buyer";
import { type Item, ItemSerializer } from "./item";

export interface CheckoutSessionCreateRequest {
  buyer?: Buyer | null;
  items: Item[];
  fulfillmentAddress?: Address | null;
}

export const CheckoutSessionCreateRequestSerializer = {
  _fromJsonObject(object: any): CheckoutSessionCreateRequest {
    return {
      buyer: object["buyer"]
        ? BuyerSerializer._fromJsonObject(object["buyer"])
        : undefined,
      items: object["items"].map((item: Item) => ItemSerializer._fromJsonObject(item)),
      fulfillmentAddress: object["fulfillment_address"]
        ? AddressSerializer._fromJsonObject(object["fulfillment_address"])
        : undefined,
    };
  },

  _toJsonObject(self: CheckoutSessionCreateRequest): any {
    return {
      buyer: self.buyer ? BuyerSerializer._toJsonObject(self.buyer) : undefined,
      items: self.items.map((item) => ItemSerializer._toJsonObject(item)),
      fulfillment_address: self.fulfillmentAddress
        ? AddressSerializer._toJsonObject(self.fulfillmentAddress)
        : undefined,
    };
  },
};
