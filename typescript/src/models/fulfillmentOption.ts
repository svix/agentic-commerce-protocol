// this file is @generated
import {
  type FulfillmentOptionDigital,
  FulfillmentOptionDigitalSerializer,
} from "./fulfillmentOptionDigital";
import {
  type FulfillmentOptionShipping,
  FulfillmentOptionShippingSerializer,
} from "./fulfillmentOptionShipping";
// biome-ignore lint/suspicious/noEmptyInterface: backwards compat
interface _FulfillmentOptionFields {}

interface FulfillmentOptionVariantShipping {
  type: "shipping";
  data: FulfillmentOptionShipping;
}

interface FulfillmentOptionVariantDigital {
  type: "digital";
  data: FulfillmentOptionDigital;
}

export type FulfillmentOption = _FulfillmentOptionFields &
  (FulfillmentOptionVariantShipping | FulfillmentOptionVariantDigital);

export const FulfillmentOptionSerializer = {
  _fromJsonObject(object: any): FulfillmentOption {
    const type = object["type"];

    function getData(type: string): any {
      switch (type) {
        case "shipping":
          return FulfillmentOptionShippingSerializer._fromJsonObject(object["data"]);
        case "digital":
          return FulfillmentOptionDigitalSerializer._fromJsonObject(object["data"]);
        default:
          throw new Error(`Unexpected type: ${type}`);
      }
    }
    return {
      type,
      data: getData(type),
    };
  },

  _toJsonObject(self: FulfillmentOption): any {
    // biome-ignore lint/suspicious/noImplicitAnyLet: the return type needs to be any
    let data;
    switch (self.type) {
      case "shipping":
        data = FulfillmentOptionShippingSerializer._toJsonObject(self.data);
        break;
      case "digital":
        data = FulfillmentOptionDigitalSerializer._toJsonObject(self.data);
        break;
    }

    return {
      type: self.type,
      data: data,
    };
  },
};
