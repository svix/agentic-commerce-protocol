// this file is @generated

export enum PaymentProviderType {
  Stripe = "stripe",
}

export const PaymentProviderTypeSerializer = {
  _fromJsonObject(object: any): PaymentProviderType {
    return object;
  },

  _toJsonObject(self: PaymentProviderType): any {
    return self;
  },
};
