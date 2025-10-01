// this file is @generated
import { type Address, AddressSerializer } from "./address";
import { type Buyer, BuyerSerializer } from "./buyer";
import { type Item, ItemSerializer } from "./item";

export interface CheckoutSessionUpdateRequest {
  buyer?: Buyer | null;
  items?: Item[] | null;
  fulfillmentAddress?: Address | null;
  fulfillmentOptionId?: string | null;
}

export const CheckoutSessionUpdateRequestSerializer = {
  _fromJsonObject(object: any): CheckoutSessionUpdateRequest {
    return {
      buyer: object["buyer"]
        ? BuyerSerializer._fromJsonObject(object["buyer"])
        : undefined,
      items: object["items"]?.map((item: Item) => ItemSerializer._fromJsonObject(item)),
      fulfillmentAddress: object["fulfillment_address"]
        ? AddressSerializer._fromJsonObject(object["fulfillment_address"])
        : undefined,
      fulfillmentOptionId: object["fulfillment_option_id"],
    };
  },

  _toJsonObject(self: CheckoutSessionUpdateRequest): any {
    return {
      buyer: self.buyer ? BuyerSerializer._toJsonObject(self.buyer) : undefined,
      items: self.items?.map((item) => ItemSerializer._toJsonObject(item)),
      fulfillment_address: self.fulfillmentAddress
        ? AddressSerializer._toJsonObject(self.fulfillmentAddress)
        : undefined,
      fulfillment_option_id: self.fulfillmentOptionId,
    };
  },
};
