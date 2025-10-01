// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Refund
    {
        [JsonProperty("type", Required = Required.Always)]
        public required RefundType Type { get; set; }

        [JsonProperty("amount", Required = Required.Always)]
        public required long Amount { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Refund {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  Amount: ").Append(Amount).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
