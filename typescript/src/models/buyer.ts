// this file is @generated

export interface Buyer {
  firstName: string;
  lastName: string;
  email: string;
  phoneNumber?: string | null;
}

export const BuyerSerializer = {
  _fromJsonObject(object: any): Buyer {
    return {
      firstName: object["first_name"],
      lastName: object["last_name"],
      email: object["email"],
      phoneNumber: object["phone_number"],
    };
  },

  _toJsonObject(self: Buyer): any {
    return {
      first_name: self.firstName,
      last_name: self.lastName,
      email: self.email,
      phone_number: self.phoneNumber,
    };
  },
};
