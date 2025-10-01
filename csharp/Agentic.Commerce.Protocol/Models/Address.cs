// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Address
    {
        [JsonProperty("name", Required = Required.Always)]
        public required string Name { get; set; }

        [JsonProperty("line_one", Required = Required.Always)]
        public required string LineOne { get; set; }

        [JsonProperty("line_two")]
        public string? LineTwo { get; set; } = null;

        [JsonProperty("city", Required = Required.Always)]
        public required string City { get; set; }

        [JsonProperty("state", Required = Required.Always)]
        public required string State { get; set; }

        [JsonProperty("country", Required = Required.Always)]
        public required string Country { get; set; }

        [JsonProperty("postal_code", Required = Required.Always)]
        public required string PostalCode { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Address {\n");
            sb.Append("  Name: ").Append(Name).Append('\n');
            sb.Append("  LineOne: ").Append(LineOne).Append('\n');
            sb.Append("  LineTwo: ").Append(LineTwo).Append('\n');
            sb.Append("  City: ").Append(City).Append('\n');
            sb.Append("  State: ").Append(State).Append('\n');
            sb.Append("  Country: ").Append(Country).Append('\n');
            sb.Append("  PostalCode: ").Append(PostalCode).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
