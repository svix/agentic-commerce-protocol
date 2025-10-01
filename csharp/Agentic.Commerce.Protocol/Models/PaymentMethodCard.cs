// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class PaymentMethodCard
    {
        [JsonProperty("type", Required = Required.Always)]
        public required string Type { get; set; }

        [JsonProperty("card_number_type", Required = Required.Always)]
        public required CardNumberType CardNumberType { get; set; }

        [JsonProperty("number", Required = Required.Always)]
        public required string Number { get; set; }

        [JsonProperty("exp_month")]
        public string? ExpMonth { get; set; } = null;

        [JsonProperty("exp_year")]
        public string? ExpYear { get; set; } = null;

        [JsonProperty("name")]
        public string? Name { get; set; } = null;

        [JsonProperty("cvc")]
        public string? Cvc { get; set; } = null;

        [JsonProperty("cryptogram")]
        public string? Cryptogram { get; set; } = null;

        [JsonProperty("eci_value")]
        public string? EciValue { get; set; } = null;

        [JsonProperty("checks_performed")]
        public List<CheckPerformedType>? ChecksPerformed { get; set; } = null;

        [JsonProperty("iin")]
        public string? Iin { get; set; } = null;

        [JsonProperty("display_card_funding_type", Required = Required.Always)]
        public required CardFundingType DisplayCardFundingType { get; set; }

        [JsonProperty("display_wallet_type")]
        public string? DisplayWalletType { get; set; } = null;

        [JsonProperty("display_brand")]
        public string? DisplayBrand { get; set; } = null;

        [JsonProperty("display_last4")]
        public string? DisplayLast4 { get; set; } = null;

        [JsonProperty("metadata", Required = Required.Always)]
        public required Dictionary<string, string> Metadata { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class PaymentMethodCard {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  CardNumberType: ").Append(CardNumberType).Append('\n');
            sb.Append("  Number: ").Append(Number).Append('\n');
            sb.Append("  ExpMonth: ").Append(ExpMonth).Append('\n');
            sb.Append("  ExpYear: ").Append(ExpYear).Append('\n');
            sb.Append("  Name: ").Append(Name).Append('\n');
            sb.Append("  Cvc: ").Append(Cvc).Append('\n');
            sb.Append("  Cryptogram: ").Append(Cryptogram).Append('\n');
            sb.Append("  EciValue: ").Append(EciValue).Append('\n');
            sb.Append("  ChecksPerformed: ").Append(ChecksPerformed).Append('\n');
            sb.Append("  Iin: ").Append(Iin).Append('\n');
            sb.Append("  DisplayCardFundingType: ").Append(DisplayCardFundingType).Append('\n');
            sb.Append("  DisplayWalletType: ").Append(DisplayWalletType).Append('\n');
            sb.Append("  DisplayBrand: ").Append(DisplayBrand).Append('\n');
            sb.Append("  DisplayLast4: ").Append(DisplayLast4).Append('\n');
            sb.Append("  Metadata: ").Append(Metadata).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
