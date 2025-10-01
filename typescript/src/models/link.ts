// this file is @generated
import { type LinkType, LinkTypeSerializer } from "./linkType";

export interface Link {
  type: LinkType;
  url: string;
}

export const LinkSerializer = {
  _fromJsonObject(object: any): Link {
    return {
      type: LinkTypeSerializer._fromJsonObject(object["type"]),
      url: object["url"],
    };
  },

  _toJsonObject(self: Link): any {
    return {
      type: LinkTypeSerializer._toJsonObject(self.type),
      url: self.url,
    };
  },
};
