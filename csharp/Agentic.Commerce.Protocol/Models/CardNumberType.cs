// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CardNumberType
    {
        [EnumMember(Value = "fpan")]
        Fpan = 1,

        [EnumMember(Value = "network_token")]
        NetworkToken = 2,
    }
}
