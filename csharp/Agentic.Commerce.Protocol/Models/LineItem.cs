// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class LineItem
    {
        [JsonProperty("id", Required = Required.Always)]
        public required string Id { get; set; }

        [JsonProperty("item", Required = Required.Always)]
        public required Item Item { get; set; }

        [JsonProperty("base_amount", Required = Required.Always)]
        public required long BaseAmount { get; set; }

        [JsonProperty("discount", Required = Required.Always)]
        public required long Discount { get; set; }

        [JsonProperty("subtotal", Required = Required.Always)]
        public required long Subtotal { get; set; }

        [JsonProperty("tax", Required = Required.Always)]
        public required long Tax { get; set; }

        [JsonProperty("total", Required = Required.Always)]
        public required long Total { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class LineItem {\n");
            sb.Append("  Id: ").Append(Id).Append('\n');
            sb.Append("  Item: ").Append(Item).Append('\n');
            sb.Append("  BaseAmount: ").Append(BaseAmount).Append('\n');
            sb.Append("  Discount: ").Append(Discount).Append('\n');
            sb.Append("  Subtotal: ").Append(Subtotal).Append('\n');
            sb.Append("  Tax: ").Append(Tax).Append('\n');
            sb.Append("  Total: ").Append(Total).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
