// this file is @generated
import { type MessageError, MessageErrorSerializer } from "./messageError";
import { type MessageInfo, MessageInfoSerializer } from "./messageInfo";
// biome-ignore lint/suspicious/noEmptyInterface: backwards compat
interface _MessageFields {}

interface MessageVariantInfo {
  type: "info";
  data: MessageInfo;
}

interface MessageVariantError {
  type: "error";
  data: MessageError;
}

export type Message = _MessageFields & (MessageVariantInfo | MessageVariantError);

export const MessageSerializer = {
  _fromJsonObject(object: any): Message {
    const type = object["type"];

    function getData(type: string): any {
      switch (type) {
        case "info":
          return MessageInfoSerializer._fromJsonObject(object["data"]);
        case "error":
          return MessageErrorSerializer._fromJsonObject(object["data"]);
        default:
          throw new Error(`Unexpected type: ${type}`);
      }
    }
    return {
      type,
      data: getData(type),
    };
  },

  _toJsonObject(self: Message): any {
    // biome-ignore lint/suspicious/noImplicitAnyLet: the return type needs to be any
    let data;
    switch (self.type) {
      case "info":
        data = MessageInfoSerializer._toJsonObject(self.data);
        break;
      case "error":
        data = MessageErrorSerializer._toJsonObject(self.data);
        break;
    }

    return {
      type: self.type,
      data: data,
    };
  },
};
