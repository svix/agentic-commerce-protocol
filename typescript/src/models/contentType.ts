// this file is @generated

export enum ContentType {
  Plain = "plain",
  Markdown = "markdown",
}

export const ContentTypeSerializer = {
  _fromJsonObject(object: any): ContentType {
    return object;
  },

  _toJsonObject(self: ContentType): any {
    return self;
  },
};
