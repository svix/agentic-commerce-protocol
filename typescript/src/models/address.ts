// this file is @generated

export interface Address {
  name: string;
  lineOne: string;
  lineTwo?: string | null;
  city: string;
  state: string;
  country: string;
  postalCode: string;
}

export const AddressSerializer = {
  _fromJsonObject(object: any): Address {
    return {
      name: object["name"],
      lineOne: object["line_one"],
      lineTwo: object["line_two"],
      city: object["city"],
      state: object["state"],
      country: object["country"],
      postalCode: object["postal_code"],
    };
  },

  _toJsonObject(self: Address): any {
    return {
      name: self.name,
      line_one: self.lineOne,
      line_two: self.lineTwo,
      city: self.city,
      state: self.state,
      country: self.country,
      postal_code: self.postalCode,
    };
  },
};
