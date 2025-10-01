// this file is @generated
import { type RiskSignalAction, RiskSignalActionSerializer } from "./riskSignalAction";
import { type RiskSignalType, RiskSignalTypeSerializer } from "./riskSignalType";

export interface RiskSignal {
  type: RiskSignalType;
  score: number;
  action: RiskSignalAction;
}

export const RiskSignalSerializer = {
  _fromJsonObject(object: any): RiskSignal {
    return {
      type: RiskSignalTypeSerializer._fromJsonObject(object["type"]),
      score: object["score"],
      action: RiskSignalActionSerializer._fromJsonObject(object["action"]),
    };
  },

  _toJsonObject(self: RiskSignal): any {
    return {
      type: RiskSignalTypeSerializer._toJsonObject(self.type),
      score: self.score,
      action: RiskSignalActionSerializer._toJsonObject(self.action),
    };
  },
};
