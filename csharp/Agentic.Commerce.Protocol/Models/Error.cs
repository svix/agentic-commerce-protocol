// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Error
    {
        [JsonProperty("type", Required = Required.Always)]
        public required ErrorType Type { get; set; }

        [JsonProperty("code", Required = Required.Always)]
        public required string Code { get; set; }

        [JsonProperty("message", Required = Required.Always)]
        public required string Message { get; set; }

        [JsonProperty("param")]
        public string? Param { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Error {\n");
            sb.Append("  Type: ").Append(Type).Append('\n');
            sb.Append("  Code: ").Append(Code).Append('\n');
            sb.Append("  Message: ").Append(Message).Append('\n');
            sb.Append("  Param: ").Append(Param).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
