// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RefundType
    {
        [EnumMember(Value = "store_credit")]
        StoreCredit = 1,

        [EnumMember(Value = "original_payment")]
        OriginalPayment = 2,
    }
}
