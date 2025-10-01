// this file is @generated

export enum LinkType {
  TermsOfUse = "terms_of_use",
  PrivacyPolicy = "privacy_policy",
  SellerShopPolicies = "seller_shop_policies",
}

export const LinkTypeSerializer = {
  _fromJsonObject(object: any): LinkType {
    return object;
  },

  _toJsonObject(self: LinkType): any {
    return self;
  },
};
