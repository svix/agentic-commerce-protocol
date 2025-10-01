// this file is @generated
using System.Text;
using Newtonsoft.Json;

namespace Agentic.Commerce.Protocol
{
    public class CheckoutSession
    {
        [JsonProperty("id", Required = Required.Always)]
        public required string Id { get; set; }

        [JsonProperty("buyer")]
        public Buyer? Buyer { get; set; } = null;

        [JsonProperty("payment_provider")]
        public PaymentProvider? PaymentProvider { get; set; } = null;

        [JsonProperty("status", Required = Required.Always)]
        public required CheckoutSessionStatus Status { get; set; }

        [JsonProperty("currency", Required = Required.Always)]
        public required string Currency { get; set; }

        [JsonProperty("line_items", Required = Required.Always)]
        public required List<LineItem> LineItems { get; set; }

        [JsonProperty("fulfillment_address")]
        public Address? FulfillmentAddress { get; set; } = null;

        [JsonProperty("fulfillment_options", Required = Required.Always)]
        public required List<FulfillmentOption> FulfillmentOptions { get; set; }

        [JsonProperty("fulfillment_option_id")]
        public string? FulfillmentOptionId { get; set; } = null;

        [JsonProperty("totals", Required = Required.Always)]
        public required List<Total> Totals { get; set; }

        [JsonProperty("messages", Required = Required.Always)]
        public required List<Message> Messages { get; set; }

        [JsonProperty("links", Required = Required.Always)]
        public required List<Link> Links { get; set; }

        [JsonProperty("order")]
        public Order? Order { get; set; } = null;

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class CheckoutSession {\n");
            sb.Append("  Id: ").Append(Id).Append('\n');
            sb.Append("  Buyer: ").Append(Buyer).Append('\n');
            sb.Append("  PaymentProvider: ").Append(PaymentProvider).Append('\n');
            sb.Append("  Status: ").Append(Status).Append('\n');
            sb.Append("  Currency: ").Append(Currency).Append('\n');
            sb.Append("  LineItems: ").Append(LineItems).Append('\n');
            sb.Append("  FulfillmentAddress: ").Append(FulfillmentAddress).Append('\n');
            sb.Append("  FulfillmentOptions: ").Append(FulfillmentOptions).Append('\n');
            sb.Append("  FulfillmentOptionId: ").Append(FulfillmentOptionId).Append('\n');
            sb.Append("  Totals: ").Append(Totals).Append('\n');
            sb.Append("  Messages: ").Append(Messages).Append('\n');
            sb.Append("  Links: ").Append(Links).Append('\n');
            sb.Append("  Order: ").Append(Order).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }
}
