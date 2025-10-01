// this file is @generated
import { type TotalType, TotalTypeSerializer } from "./totalType";

export interface Total {
  type: TotalType;
  displayText: string;
  amount: number;
}

export const TotalSerializer = {
  _fromJsonObject(object: any): Total {
    return {
      type: TotalTypeSerializer._fromJsonObject(object["type"]),
      displayText: object["display_text"],
      amount: object["amount"],
    };
  },

  _toJsonObject(self: Total): any {
    return {
      type: TotalTypeSerializer._toJsonObject(self.type),
      display_text: self.displayText,
      amount: self.amount,
    };
  },
};
