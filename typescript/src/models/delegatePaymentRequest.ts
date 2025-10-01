// this file is @generated
import { type Address, AddressSerializer } from "./address";
import { type Allowance, AllowanceSerializer } from "./allowance";
import { type PaymentMethodCard, PaymentMethodCardSerializer } from "./paymentMethodCard";
import { type RiskSignal, RiskSignalSerializer } from "./riskSignal";

export interface DelegatePaymentRequest {
  paymentMethod: PaymentMethodCard;
  allowance: Allowance;
  billingAddress?: Address | null;
  riskSignals: RiskSignal[];
  metadata: { [key: string]: string };
}

export const DelegatePaymentRequestSerializer = {
  _fromJsonObject(object: any): DelegatePaymentRequest {
    return {
      paymentMethod: PaymentMethodCardSerializer._fromJsonObject(
        object["payment_method"]
      ),
      allowance: AllowanceSerializer._fromJsonObject(object["allowance"]),
      billingAddress: object["billing_address"]
        ? AddressSerializer._fromJsonObject(object["billing_address"])
        : undefined,
      riskSignals: object["risk_signals"].map((item: RiskSignal) =>
        RiskSignalSerializer._fromJsonObject(item)
      ),
      metadata: object["metadata"],
    };
  },

  _toJsonObject(self: DelegatePaymentRequest): any {
    return {
      payment_method: PaymentMethodCardSerializer._toJsonObject(self.paymentMethod),
      allowance: AllowanceSerializer._toJsonObject(self.allowance),
      billing_address: self.billingAddress
        ? AddressSerializer._toJsonObject(self.billingAddress)
        : undefined,
      risk_signals: self.riskSignals.map((item) =>
        RiskSignalSerializer._toJsonObject(item)
      ),
      metadata: self.metadata,
    };
  },
};
