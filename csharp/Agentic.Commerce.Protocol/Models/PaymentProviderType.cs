// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PaymentProviderType
    {
        [EnumMember(Value = "stripe")]
        Stripe = 1,
    }
}
