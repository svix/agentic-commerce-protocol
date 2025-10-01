// this file is @generated
import { type Buyer, BuyerSerializer } from "./buyer";
import { type PaymentData, PaymentDataSerializer } from "./paymentData";

export interface CheckoutSessionCompleteRequest {
  buyer?: Buyer | null;
  paymentData: PaymentData;
}

export const CheckoutSessionCompleteRequestSerializer = {
  _fromJsonObject(object: any): CheckoutSessionCompleteRequest {
    return {
      buyer: object["buyer"]
        ? BuyerSerializer._fromJsonObject(object["buyer"])
        : undefined,
      paymentData: PaymentDataSerializer._fromJsonObject(object["payment_data"]),
    };
  },

  _toJsonObject(self: CheckoutSessionCompleteRequest): any {
    return {
      buyer: self.buyer ? BuyerSerializer._toJsonObject(self.buyer) : undefined,
      payment_data: PaymentDataSerializer._toJsonObject(self.paymentData),
    };
  },
};
