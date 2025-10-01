// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class Buyer
    {
        [JsonProperty("first_name", Required = Required.Always)]
        public required string FirstName { get; set; }

        [JsonProperty("last_name", Required = Required.Always)]
        public required string LastName { get; set; }

        [JsonProperty("email", Required = Required.Always)]
        public required string Email { get; set; }

        [JsonProperty("phone_number")]
        public string? PhoneNumber { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class Buyer {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append('\n');
            sb.Append("  LastName: ").Append(LastName).Append('\n');
            sb.Append("  Email: ").Append(Email).Append('\n');
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
