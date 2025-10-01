// this file is @generated

export enum RiskSignalAction {
  Blocked = "blocked",
  ManualReview = "manual_review",
  Authorized = "authorized",
}

export const RiskSignalActionSerializer = {
  _fromJsonObject(object: any): RiskSignalAction {
    return object;
  },

  _toJsonObject(self: RiskSignalAction): any {
    return self;
  },
};
