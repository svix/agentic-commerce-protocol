// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class MessageInfo
    {
        [JsonProperty("param")]
        public string? Param { get; set; } = null;

        [JsonProperty("content_type", Required = Required.Always)]
        public required ContentType ContentType { get; set; }

        [JsonProperty("content", Required = Required.Always)]
        public required string Content { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class MessageInfo {\n");
            sb.Append("  Param: ").Append(Param).Append('\n');
            sb.Append("  ContentType: ").Append(ContentType).Append('\n');
            sb.Append("  Content: ").Append(Content).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
