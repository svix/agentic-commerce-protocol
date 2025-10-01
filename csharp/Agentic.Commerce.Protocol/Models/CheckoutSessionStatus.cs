// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CheckoutSessionStatus
    {
        [EnumMember(Value = "not_ready_for_payment")]
        NotReadyForPayment = 1,

        [EnumMember(Value = "ready_for_payment")]
        ReadyForPayment = 2,

        [EnumMember(Value = "completed")]
        Completed = 3,

        [EnumMember(Value = "canceled")]
        Canceled = 4,

        [EnumMember(Value = "in_progress")]
        InProgress = 5,
    }
}
