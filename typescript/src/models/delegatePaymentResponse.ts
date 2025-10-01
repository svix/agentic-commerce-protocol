// this file is @generated

export interface DelegatePaymentResponse {
  id: string;
  created: string;
  metadata: { [key: string]: string };
}

export const DelegatePaymentResponseSerializer = {
  _fromJsonObject(object: any): DelegatePaymentResponse {
    return {
      id: object["id"],
      created: object["created"],
      metadata: object["metadata"],
    };
  },

  _toJsonObject(self: DelegatePaymentResponse): any {
    return {
      id: self.id,
      created: self.created,
      metadata: self.metadata,
    };
  },
};
