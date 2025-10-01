// this file is @generated
import { type RefundType, RefundTypeSerializer } from "./refundType";

export interface Refund {
  type: RefundType;
  amount: number;
}

export const RefundSerializer = {
  _fromJsonObject(object: any): Refund {
    return {
      type: RefundTypeSerializer._fromJsonObject(object["type"]),
      amount: object["amount"],
    };
  },

  _toJsonObject(self: Refund): any {
    return {
      type: RefundTypeSerializer._toJsonObject(self.type),
      amount: self.amount,
    };
  },
};
