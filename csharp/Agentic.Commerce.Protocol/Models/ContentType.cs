// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ContentType
    {
        [EnumMember(Value = "plain")]
        Plain = 1,

        [EnumMember(Value = "markdown")]
        Markdown = 2,
    }
}
