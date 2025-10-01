// this file is @generated

export enum CardFundingType {
  Credit = "credit",
  Debit = "debit",
  Prepaid = "prepaid",
}

export const CardFundingTypeSerializer = {
  _fromJsonObject(object: any): CardFundingType {
    return object;
  },

  _toJsonObject(self: CardFundingType): any {
    return self;
  },
};
