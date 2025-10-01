// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class RiskSignal
    {
        [JsonProperty("type", Required = Required.Always)]
        public required RiskSignalType Type { get; set; }

        [JsonProperty("score", Required = Required.Always)]
        public required long Score { get; set; }

        [JsonProperty("action", Required = Required.Always)]
        public required RiskSignalAction Action { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class RiskSignal {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  Score: ").Append(Score).Append('\n');
            sb.Append("  Action: ").Append(Action).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
