// this file is @generated
import { type ErrorType, ErrorTypeSerializer } from "./errorType";

export interface Error {
  type: ErrorType;
  code: string;
  message: string;
  param?: string | null;
}

export const ErrorSerializer = {
  _fromJsonObject(object: any): Error {
    return {
      type: ErrorTypeSerializer._fromJsonObject(object["type"]),
      code: object["code"],
      message: object["message"],
      param: object["param"],
    };
  },

  _toJsonObject(self: Error): any {
    return {
      type: ErrorTypeSerializer._toJsonObject(self.type),
      code: self.code,
      message: self.message,
      param: self.param,
    };
  },
};
