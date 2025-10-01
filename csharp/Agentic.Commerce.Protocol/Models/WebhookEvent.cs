// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class WebhookEvent
    {
        [JsonProperty("type", Required = Required.Always)]
        public required WebhookEventType Type { get; set; }

        [JsonProperty("data", Required = Required.Always)]
        public required EventDataOrder Data { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class WebhookEvent {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  Data: ").Append(Data).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
