// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Order
    {
        [JsonProperty("id", Required = Required.Always)]
        public required string Id { get; set; }

        [JsonProperty("checkout_session_id", Required = Required.Always)]
        public required string CheckoutSessionId { get; set; }

        [JsonProperty("permalink_url", Required = Required.Always)]
        public required string PermalinkUrl { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Order {\n");
            sb.Append("  Id: ").Append(Id).Append('\n');
            sb.Append("  CheckoutSessionId: ").Append(CheckoutSessionId).Append('\n');
            sb.Append("  PermalinkUrl: ").Append(PermalinkUrl).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
