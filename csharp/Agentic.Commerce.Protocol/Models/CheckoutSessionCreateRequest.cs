// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class CheckoutSessionCreateRequest
    {
        [JsonProperty("buyer")]
        public Buyer? Buyer { get; set; } = null;

        [JsonProperty("items", Required = Required.Always)]
        public required List<Item> Items { get; set; }

        [JsonProperty("fulfillment_address")]
        public Address? FulfillmentAddress { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class CheckoutSessionCreateRequest {\n");
            sb.Append("  Buyer: ").Append(Buyer).Append('\n');
            sb.Append("  Items: ").Append(Items).Append('\n');
            sb.Append("  FulfillmentAddress: ").Append(FulfillmentAddress).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
