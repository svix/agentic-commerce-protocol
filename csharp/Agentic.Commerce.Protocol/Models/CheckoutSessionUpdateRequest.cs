// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class CheckoutSessionUpdateRequest
    {
        [JsonProperty("buyer")]
        public Buyer? Buyer { get; set; } = null;

        [JsonProperty("items")]
        public List<Item>? Items { get; set; } = null;

        [JsonProperty("fulfillment_address")]
        public Address? FulfillmentAddress { get; set; } = null;

        [JsonProperty("fulfillment_option_id")]
        public string? FulfillmentOptionId { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class CheckoutSessionUpdateRequest {\n");
            sb.Append("  Buyer: ").Append(Buyer).Append('\n');
            sb.Append("  Items: ").Append(Items).Append('\n');
            sb.Append("  FulfillmentAddress: ").Append(FulfillmentAddress).Append('\n');
            sb.Append("  FulfillmentOptionId: ").Append(FulfillmentOptionId).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
