// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Allowance
    {
        [JsonProperty("reason", Required = Required.Always)]
        public required AllowanceReason Reason { get; set; }

        [JsonProperty("max_amount", Required = Required.Always)]
        public required long MaxAmount { get; set; }

        [JsonProperty("currency", Required = Required.Always)]
        public required string Currency { get; set; }

        [JsonProperty("checkout_session_id", Required = Required.Always)]
        public required string CheckoutSessionId { get; set; }

        [JsonProperty("merchant_id", Required = Required.Always)]
        public required string MerchantId { get; set; }

        [JsonProperty("expires_at", Required = Required.Always)]
        public required string ExpiresAt { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Allowance {\n");
            sb.Append("  Reason: ").Append(Reason).Append('\n');
            sb.Append("  MaxAmount: ").Append(MaxAmount).Append('\n');
            sb.Append("  Currency: ").Append(Currency).Append('\n');
            sb.Append("  CheckoutSessionId: ").Append(CheckoutSessionId).Append('\n');
            sb.Append("  MerchantId: ").Append(MerchantId).Append('\n');
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
