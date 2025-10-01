// this file is @generated

export interface FulfillmentOptionShipping {
  id: string;
  title: string;
  subtitle?: string | null;
  carrier?: string | null;
  earliestDeliveryTime?: string | null;
  latestDeliveryTime?: string | null;
  subtotal: number;
  tax: number;
  total: number;
}

export const FulfillmentOptionShippingSerializer = {
  _fromJsonObject(object: any): FulfillmentOptionShipping {
    return {
      id: object["id"],
      title: object["title"],
      subtitle: object["subtitle"],
      carrier: object["carrier"],
      earliestDeliveryTime: object["earliest_delivery_time"],
      latestDeliveryTime: object["latest_delivery_time"],
      subtotal: object["subtotal"],
      tax: object["tax"],
      total: object["total"],
    };
  },

  _toJsonObject(self: FulfillmentOptionShipping): any {
    return {
      id: self.id,
      title: self.title,
      subtitle: self.subtitle,
      carrier: self.carrier,
      earliest_delivery_time: self.earliestDeliveryTime,
      latest_delivery_time: self.latestDeliveryTime,
      subtotal: self.subtotal,
      tax: self.tax,
      total: self.total,
    };
  },
};
