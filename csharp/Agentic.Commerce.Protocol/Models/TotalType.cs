// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TotalType
    {
        [EnumMember(Value = "items_base_amount")]
        ItemsBaseAmount = 1,

        [EnumMember(Value = "items_discount")]
        ItemsDiscount = 2,

        [EnumMember(Value = "subtotal")]
        Subtotal = 3,

        [EnumMember(Value = "discount")]
        Discount = 4,

        [EnumMember(Value = "fulfillment")]
        Fulfillment = 5,

        [EnumMember(Value = "tax")]
        Tax = 6,

        [EnumMember(Value = "fee")]
        Fee = 7,

        [EnumMember(Value = "total")]
        Total = 8,
    }
}
