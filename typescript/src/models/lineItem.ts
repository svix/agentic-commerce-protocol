// this file is @generated
import { type Item, ItemSerializer } from "./item";

export interface LineItem {
  id: string;
  item: Item;
  baseAmount: number;
  discount: number;
  subtotal: number;
  tax: number;
  total: number;
}

export const LineItemSerializer = {
  _fromJsonObject(object: any): LineItem {
    return {
      id: object["id"],
      item: ItemSerializer._fromJsonObject(object["item"]),
      baseAmount: object["base_amount"],
      discount: object["discount"],
      subtotal: object["subtotal"],
      tax: object["tax"],
      total: object["total"],
    };
  },

  _toJsonObject(self: LineItem): any {
    return {
      id: self.id,
      item: ItemSerializer._toJsonObject(self.item),
      base_amount: self.baseAmount,
      discount: self.discount,
      subtotal: self.subtotal,
      tax: self.tax,
      total: self.total,
    };
  },
};
