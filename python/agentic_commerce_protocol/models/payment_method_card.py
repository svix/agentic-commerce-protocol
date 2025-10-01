# this file is @generated
import typing as t

from .card_funding_type import CardFundingType
from .card_number_type import CardNumberType
from .check_performed_type import CheckPerformedType
from .common import BaseModel


class PaymentMethodCard(BaseModel):
    type: str
    card_number_type: CardNumberType
    number: str
    exp_month: t.Optional[str] = None
    exp_year: t.Optional[str] = None
    name: t.Optional[str] = None
    cvc: t.Optional[str] = None
    cryptogram: t.Optional[str] = None
    eci_value: t.Optional[str] = None
    checks_performed: t.Optional[t.List[CheckPerformedType]] = None
    iin: t.Optional[str] = None
    display_card_funding_type: CardFundingType
    display_wallet_type: t.Optional[str] = None
    display_brand: t.Optional[str] = None
    display_last4: t.Optional[str] = None
    metadata: t.Dict[str, str]
