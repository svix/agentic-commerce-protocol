// this file is @generated

export enum CardNumberType {
  Fpan = "fpan",
  NetworkToken = "network_token",
}

export const CardNumberTypeSerializer = {
  _fromJsonObject(object: any): CardNumberType {
    return object;
  },

  _toJsonObject(self: CardNumberType): any {
    return self;
  },
};
