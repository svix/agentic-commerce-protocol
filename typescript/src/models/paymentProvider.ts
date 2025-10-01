// this file is @generated
import { type PaymentMethodType, PaymentMethodTypeSerializer } from "./paymentMethodType";
import {
  type PaymentProviderType,
  PaymentProviderTypeSerializer,
} from "./paymentProviderType";

export interface PaymentProvider {
  provider: PaymentProviderType;
  supportedPaymentMethods: PaymentMethodType[];
}

export const PaymentProviderSerializer = {
  _fromJsonObject(object: any): PaymentProvider {
    return {
      provider: PaymentProviderTypeSerializer._fromJsonObject(object["provider"]),
      supportedPaymentMethods: object["supported_payment_methods"].map(
        (item: PaymentMethodType) => PaymentMethodTypeSerializer._fromJsonObject(item)
      ),
    };
  },

  _toJsonObject(self: PaymentProvider): any {
    return {
      provider: PaymentProviderTypeSerializer._toJsonObject(self.provider),
      supported_payment_methods: self.supportedPaymentMethods.map((item) =>
        PaymentMethodTypeSerializer._toJsonObject(item)
      ),
    };
  },
};
