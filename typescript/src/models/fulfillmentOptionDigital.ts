// this file is @generated

export interface FulfillmentOptionDigital {
  id: string;
  title: string;
  subtitle?: string | null;
  subtotal: number;
  tax: number;
  total: number;
}

export const FulfillmentOptionDigitalSerializer = {
  _fromJsonObject(object: any): FulfillmentOptionDigital {
    return {
      id: object["id"],
      title: object["title"],
      subtitle: object["subtitle"],
      subtotal: object["subtotal"],
      tax: object["tax"],
      total: object["total"],
    };
  },

  _toJsonObject(self: FulfillmentOptionDigital): any {
    return {
      id: self.id,
      title: self.title,
      subtitle: self.subtitle,
      subtotal: self.subtotal,
      tax: self.tax,
      total: self.total,
    };
  },
};
