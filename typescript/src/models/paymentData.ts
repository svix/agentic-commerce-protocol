// this file is @generated
import { type Address, AddressSerializer } from "./address";
import {
  type PaymentProviderType,
  PaymentProviderTypeSerializer,
} from "./paymentProviderType";

export interface PaymentData {
  token: string;
  provider: PaymentProviderType;
  billingAddress?: Address | null;
}

export const PaymentDataSerializer = {
  _fromJsonObject(object: any): PaymentData {
    return {
      token: object["token"],
      provider: PaymentProviderTypeSerializer._fromJsonObject(object["provider"]),
      billingAddress: object["billing_address"]
        ? AddressSerializer._fromJsonObject(object["billing_address"])
        : undefined,
    };
  },

  _toJsonObject(self: PaymentData): any {
    return {
      token: self.token,
      provider: PaymentProviderTypeSerializer._toJsonObject(self.provider),
      billing_address: self.billingAddress
        ? AddressSerializer._toJsonObject(self.billingAddress)
        : undefined,
    };
  },
};
