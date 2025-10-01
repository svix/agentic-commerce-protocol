// this file is @generated

export enum TotalType {
  ItemsBaseAmount = "items_base_amount",
  ItemsDiscount = "items_discount",
  Subtotal = "subtotal",
  Discount = "discount",
  Fulfillment = "fulfillment",
  Tax = "tax",
  Fee = "fee",
  Total = "total",
}

export const TotalTypeSerializer = {
  _fromJsonObject(object: any): TotalType {
    return object;
  },

  _toJsonObject(self: TotalType): any {
    return self;
  },
};
