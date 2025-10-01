// this file is @generated
import { type ContentType, ContentTypeSerializer } from "./contentType";

export interface MessageInfo {
  param?: string | null;
  contentType: ContentType;
  content: string;
}

export const MessageInfoSerializer = {
  _fromJsonObject(object: any): MessageInfo {
    return {
      param: object["param"],
      contentType: ContentTypeSerializer._fromJsonObject(object["content_type"]),
      content: object["content"],
    };
  },

  _toJsonObject(self: MessageInfo): any {
    return {
      param: self.param,
      content_type: ContentTypeSerializer._toJsonObject(self.contentType),
      content: self.content,
    };
  },
};
