// this file is @generated
import { type ContentType, ContentTypeSerializer } from "./contentType";
import { type ErrorCode, ErrorCodeSerializer } from "./errorCode";

export interface MessageError {
  code: ErrorCode;
  param?: string | null;
  contentType: ContentType;
  content: string;
}

export const MessageErrorSerializer = {
  _fromJsonObject(object: any): MessageError {
    return {
      code: ErrorCodeSerializer._fromJsonObject(object["code"]),
      param: object["param"],
      contentType: ContentTypeSerializer._fromJsonObject(object["content_type"]),
      content: object["content"],
    };
  },

  _toJsonObject(self: MessageError): any {
    return {
      code: ErrorCodeSerializer._toJsonObject(self.code),
      param: self.param,
      content_type: ContentTypeSerializer._toJsonObject(self.contentType),
      content: self.content,
    };
  },
};
