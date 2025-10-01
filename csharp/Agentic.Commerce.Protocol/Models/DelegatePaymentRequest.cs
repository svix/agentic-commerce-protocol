// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class DelegatePaymentRequest
    {
        [JsonProperty("payment_method", Required = Required.Always)]
        public required PaymentMethodCard PaymentMethod { get; set; }

        [JsonProperty("allowance", Required = Required.Always)]
        public required Allowance Allowance { get; set; }

        [JsonProperty("billing_address")]
        public Address? BillingAddress { get; set; } = null;

        [JsonProperty("risk_signals", Required = Required.Always)]
        public required List<RiskSignal> RiskSignals { get; set; }

        [JsonProperty("metadata", Required = Required.Always)]
        public required Dictionary<string, string> Metadata { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class DelegatePaymentRequest {\n");
            sb.Append("  PaymentMethod: ").Append(PaymentMethod).Append('\n');
            sb.Append("  Allowance: ").Append(Allowance).Append('\n');
            sb.Append("  BillingAddress: ").Append(BillingAddress).Append('\n');
            sb.Append("  RiskSignals: ").Append(RiskSignals).Append('\n');
            sb.Append("  Metadata: ").Append(Metadata).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
