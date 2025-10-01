// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CheckPerformedType
    {
        [EnumMember(Value = "avs")]
        Avs = 1,

        [EnumMember(Value = "cvv")]
        Cvv = 2,

        [EnumMember(Value = "ani")]
        Ani = 3,

        [EnumMember(Value = "auth0")]
        Auth0 = 4,
    }
}
