// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class EventDataOrder
    {
        [JsonProperty("type", Required = Required.Always)]
        public required string Type { get; set; }

        [JsonProperty("checkout_session_id", Required = Required.Always)]
        public required string CheckoutSessionId { get; set; }

        [JsonProperty("permalink_url", Required = Required.Always)]
        public required string PermalinkUrl { get; set; }

        [JsonProperty("status", Required = Required.Always)]
        public required WebhookOrderStatus Status { get; set; }

        [JsonProperty("refunds", Required = Required.Always)]
        public required List<Refund> Refunds { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class EventDataOrder {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  CheckoutSessionId: ").Append(CheckoutSessionId).Append('\n');
            sb.Append("  PermalinkUrl: ").Append(PermalinkUrl).Append('\n');
            sb.Append("  Status: ").Append(Status).Append('\n');
            sb.Append("  Refunds: ").Append(Refunds).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
