// this file is @generated

export enum RefundType {
  StoreCredit = "store_credit",
  OriginalPayment = "original_payment",
}

export const RefundTypeSerializer = {
  _fromJsonObject(object: any): RefundType {
    return object;
  },

  _toJsonObject(self: RefundType): any {
    return self;
  },
};
