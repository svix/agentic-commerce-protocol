// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum WebhookEventType
    {
        [EnumMember(Value = "order_create")]
        OrderCreate = 1,

        [EnumMember(Value = "order_update")]
        OrderUpdate = 2,
    }
}
