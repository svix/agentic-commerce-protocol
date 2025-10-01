# this file is @generated
from enum import Enum


class LinkType(str, Enum):
    TERMS_OF_USE = "terms_of_use"
    PRIVACY_POLICY = "privacy_policy"
    SELLER_SHOP_POLICIES = "seller_shop_policies"

    def __str__(self) -> str:
        return str(self.value)
