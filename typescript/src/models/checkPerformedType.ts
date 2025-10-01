// this file is @generated

export enum CheckPerformedType {
  Avs = "avs",
  Cvv = "cvv",
  Ani = "ani",
  Auth0 = "auth0",
}

export const CheckPerformedTypeSerializer = {
  _fromJsonObject(object: any): CheckPerformedType {
    return object;
  },

  _toJsonObject(self: CheckPerformedType): any {
    return self;
  },
};
