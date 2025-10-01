// this file is @generated

export enum ErrorCode {
  Missing = "missing",
  Invalid = "invalid",
  OutOfStock = "out_of_stock",
  PaymentDeclined = "payment_declined",
  RequiresSignIn = "requires_sign_in",
  Requires3ds = "requires_3ds",
}

export const ErrorCodeSerializer = {
  _fromJsonObject(object: any): ErrorCode {
    return object;
  },

  _toJsonObject(self: ErrorCode): any {
    return self;
  },
};
