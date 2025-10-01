// this file is @generated

export interface Item {
  id: string;
  quantity: number;
}

export const ItemSerializer = {
  _fromJsonObject(object: any): Item {
    return {
      id: object["id"],
      quantity: object["quantity"],
    };
  },

  _toJsonObject(self: Item): any {
    return {
      id: self.id,
      quantity: self.quantity,
    };
  },
};
