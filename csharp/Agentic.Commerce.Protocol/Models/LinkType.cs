// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LinkType
    {
        [EnumMember(Value = "terms_of_use")]
        TermsOfUse = 1,

        [EnumMember(Value = "privacy_policy")]
        PrivacyPolicy = 2,

        [EnumMember(Value = "seller_shop_policies")]
        SellerShopPolicies = 3,
    }
}
