// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ErrorCode
    {
        [EnumMember(Value = "missing")]
        Missing = 1,

        [EnumMember(Value = "invalid")]
        Invalid = 2,

        [EnumMember(Value = "out_of_stock")]
        OutOfStock = 3,

        [EnumMember(Value = "payment_declined")]
        PaymentDeclined = 4,

        [EnumMember(Value = "requires_sign_in")]
        RequiresSignIn = 5,

        [EnumMember(Value = "requires_3ds")]
        Requires3ds = 6,
    }
}
