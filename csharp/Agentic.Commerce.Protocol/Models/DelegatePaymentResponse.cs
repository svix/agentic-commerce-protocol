// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class DelegatePaymentResponse
    {
        [JsonProperty("id", Required = Required.Always)]
        public required string Id { get; set; }

        [JsonProperty("created", Required = Required.Always)]
        public required string Created { get; set; }

        [JsonProperty("metadata", Required = Required.Always)]
        public required Dictionary<string, string> Metadata { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class DelegatePaymentResponse {\n");
            sb.Append("  Id: ").Append(Id).Append('\n');
            sb.Append("  Created: ").Append(Created).Append('\n');
            sb.Append("  Metadata: ").Append(Metadata).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
