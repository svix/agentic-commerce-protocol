// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CardFundingType
    {
        [EnumMember(Value = "credit")]
        Credit = 1,

        [EnumMember(Value = "debit")]
        Debit = 2,

        [EnumMember(Value = "prepaid")]
        Prepaid = 3,
    }
}
