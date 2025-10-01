// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class PaymentProvider
    {
        [JsonProperty("provider", Required = Required.Always)]
        public required PaymentProviderType Provider { get; set; }

        [JsonProperty("supported_payment_methods", Required = Required.Always)]
        public required List<PaymentMethodType> SupportedPaymentMethods { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class PaymentProvider {\n");
            sb.Append("  Provider: ").Append(Provider).Append('\n');
            sb.Append("  SupportedPaymentMethods: ").Append(SupportedPaymentMethods).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
