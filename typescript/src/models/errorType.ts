// this file is @generated

export enum ErrorType {
  InvalidRequest = "invalid_request",
  RequestNotIdempotent = "request_not_idempotent",
  ProcessingError = "processing_error",
  ServiceUnavailable = "service_unavailable",
}

export const ErrorTypeSerializer = {
  _fromJsonObject(object: any): ErrorType {
    return object;
  },

  _toJsonObject(self: ErrorType): any {
    return self;
  },
};
