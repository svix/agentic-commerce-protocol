// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RiskSignalAction
    {
        [EnumMember(Value = "blocked")]
        Blocked = 1,

        [EnumMember(Value = "manual_review")]
        ManualReview = 2,

        [EnumMember(Value = "authorized")]
        Authorized = 3,
    }
}
