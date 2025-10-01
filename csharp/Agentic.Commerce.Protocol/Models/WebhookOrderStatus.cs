// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum WebhookOrderStatus
    {
        [EnumMember(Value = "created")]
        Created = 1,

        [EnumMember(Value = "manual_review")]
        ManualReview = 2,

        [EnumMember(Value = "confirmed")]
        Confirmed = 3,

        [EnumMember(Value = "canceled")]
        Canceled = 4,

        [EnumMember(Value = "shipped")]
        Shipped = 5,

        [EnumMember(Value = "fulfilled")]
        Fulfilled = 6,
    }
}
