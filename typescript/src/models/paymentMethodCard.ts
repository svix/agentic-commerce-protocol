// this file is @generated
import { type CardFundingType, CardFundingTypeSerializer } from "./cardFundingType";
import { type CardNumberType, CardNumberTypeSerializer } from "./cardNumberType";
import {
  type CheckPerformedType,
  CheckPerformedTypeSerializer,
} from "./checkPerformedType";

export interface PaymentMethodCard {
  type: string;
  cardNumberType: CardNumberType;
  number: string;
  expMonth?: string | null;
  expYear?: string | null;
  name?: string | null;
  cvc?: string | null;
  cryptogram?: string | null;
  eciValue?: string | null;
  checksPerformed?: CheckPerformedType[] | null;
  iin?: string | null;
  displayCardFundingType: CardFundingType;
  displayWalletType?: string | null;
  displayBrand?: string | null;
  displayLast4?: string | null;
  metadata: { [key: string]: string };
}

export const PaymentMethodCardSerializer = {
  _fromJsonObject(object: any): PaymentMethodCard {
    return {
      type: object["type"],
      cardNumberType: CardNumberTypeSerializer._fromJsonObject(
        object["card_number_type"]
      ),
      number: object["number"],
      expMonth: object["exp_month"],
      expYear: object["exp_year"],
      name: object["name"],
      cvc: object["cvc"],
      cryptogram: object["cryptogram"],
      eciValue: object["eci_value"],
      checksPerformed: object["checks_performed"]?.map((item: CheckPerformedType) =>
        CheckPerformedTypeSerializer._fromJsonObject(item)
      ),
      iin: object["iin"],
      displayCardFundingType: CardFundingTypeSerializer._fromJsonObject(
        object["display_card_funding_type"]
      ),
      displayWalletType: object["display_wallet_type"],
      displayBrand: object["display_brand"],
      displayLast4: object["display_last4"],
      metadata: object["metadata"],
    };
  },

  _toJsonObject(self: PaymentMethodCard): any {
    return {
      type: self.type,
      card_number_type: CardNumberTypeSerializer._toJsonObject(self.cardNumberType),
      number: self.number,
      exp_month: self.expMonth,
      exp_year: self.expYear,
      name: self.name,
      cvc: self.cvc,
      cryptogram: self.cryptogram,
      eci_value: self.eciValue,
      checks_performed: self.checksPerformed?.map((item) =>
        CheckPerformedTypeSerializer._toJsonObject(item)
      ),
      iin: self.iin,
      display_card_funding_type: CardFundingTypeSerializer._toJsonObject(
        self.displayCardFundingType
      ),
      display_wallet_type: self.displayWalletType,
      display_brand: self.displayBrand,
      display_last4: self.displayLast4,
      metadata: self.metadata,
    };
  },
};
