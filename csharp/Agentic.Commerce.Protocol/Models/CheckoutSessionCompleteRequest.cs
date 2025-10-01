// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class CheckoutSessionCompleteRequest
    {
        [JsonProperty("buyer")]
        public Buyer? Buyer { get; set; } = null;

        [JsonProperty("payment_data", Required = Required.Always)]
        public required PaymentData PaymentData { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class CheckoutSessionCompleteRequest {\n");
            sb.Append("  Buyer: ").Append(Buyer).Append('\n');
            sb.Append("  PaymentData: ").Append(PaymentData).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
