// this file is @generated
import { type AllowanceReason, AllowanceReasonSerializer } from "./allowanceReason";

export interface Allowance {
  reason: AllowanceReason;
  maxAmount: number;
  currency: string;
  checkoutSessionId: string;
  merchantId: string;
  expiresAt: string;
}

export const AllowanceSerializer = {
  _fromJsonObject(object: any): Allowance {
    return {
      reason: AllowanceReasonSerializer._fromJsonObject(object["reason"]),
      maxAmount: object["max_amount"],
      currency: object["currency"],
      checkoutSessionId: object["checkout_session_id"],
      merchantId: object["merchant_id"],
      expiresAt: object["expires_at"],
    };
  },

  _toJsonObject(self: Allowance): any {
    return {
      reason: AllowanceReasonSerializer._toJsonObject(self.reason),
      max_amount: self.maxAmount,
      currency: self.currency,
      checkout_session_id: self.checkoutSessionId,
      merchant_id: self.merchantId,
      expires_at: self.expiresAt,
    };
  },
};
