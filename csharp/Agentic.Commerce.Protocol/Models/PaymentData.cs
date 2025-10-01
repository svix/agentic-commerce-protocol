// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class PaymentData
    {
        [JsonProperty("token", Required = Required.Always)]
        public required string Token { get; set; }

        [JsonProperty("provider", Required = Required.Always)]
        public required PaymentProviderType Provider { get; set; }

        [JsonProperty("billing_address")]
        public Address? BillingAddress { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class PaymentData {\n");
            sb.Append("  Token: ").Append(Token).Append('\n');
            sb.Append("  Provider: ").Append(Provider).Append('\n');
            sb.Append("  BillingAddress: ").Append(BillingAddress).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
