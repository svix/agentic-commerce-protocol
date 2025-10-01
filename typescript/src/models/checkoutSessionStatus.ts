// this file is @generated

export enum CheckoutSessionStatus {
  NotReadyForPayment = "not_ready_for_payment",
  ReadyForPayment = "ready_for_payment",
  Completed = "completed",
  Canceled = "canceled",
  InProgress = "in_progress",
}

export const CheckoutSessionStatusSerializer = {
  _fromJsonObject(object: any): CheckoutSessionStatus {
    return object;
  },

  _toJsonObject(self: CheckoutSessionStatus): any {
    return self;
  },
};
