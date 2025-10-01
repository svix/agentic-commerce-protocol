// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Link
    {
        [JsonProperty("type", Required = Required.Always)]
        public required LinkType Type { get; set; }

        [JsonProperty("url", Required = Required.Always)]
        public required string Url { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Link {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  Url: ").Append(Url).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
