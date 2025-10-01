// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class FulfillmentOptionShipping
    {
        [JsonProperty("id", Required = Required.Always)]
        public required string Id { get; set; }

        [JsonProperty("title", Required = Required.Always)]
        public required string Title { get; set; }

        [JsonProperty("subtitle")]
        public string? Subtitle { get; set; } = null;

        [JsonProperty("carrier")]
        public string? Carrier { get; set; } = null;

        [JsonProperty("earliest_delivery_time")]
        public string? EarliestDeliveryTime { get; set; } = null;

        [JsonProperty("latest_delivery_time")]
        public string? LatestDeliveryTime { get; set; } = null;

        [JsonProperty("subtotal", Required = Required.Always)]
        public required long Subtotal { get; set; }

        [JsonProperty("tax", Required = Required.Always)]
        public required long Tax { get; set; }

        [JsonProperty("total", Required = Required.Always)]
        public required long Total { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class FulfillmentOptionShipping {\n");
            sb.Append("  Id: ").Append(Id).Append('\n');
            sb.Append("  Title: ").Append(Title).Append('\n');
            sb.Append("  Subtitle: ").Append(Subtitle).Append('\n');
            sb.Append("  Carrier: ").Append(Carrier).Append('\n');
            sb.Append("  EarliestDeliveryTime: ").Append(EarliestDeliveryTime).Append('\n');
            sb.Append("  LatestDeliveryTime: ").Append(LatestDeliveryTime).Append('\n');
            sb.Append("  Subtotal: ").Append(Subtotal).Append('\n');
            sb.Append("  Tax: ").Append(Tax).Append('\n');
            sb.Append("  Total: ").Append(Total).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
