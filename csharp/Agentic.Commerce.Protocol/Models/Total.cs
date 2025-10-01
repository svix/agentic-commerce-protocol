// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Total
    {
        [JsonProperty("type", Required = Required.Always)]
        public required TotalType Type { get; set; }

        [JsonProperty("display_text", Required = Required.Always)]
        public required string DisplayText { get; set; }

        [JsonProperty("amount", Required = Required.Always)]
        public required long Amount { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Total {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  DisplayText: ").Append(DisplayText).Append('\n');
            sb.Append("  Amount: ").Append(Amount).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
