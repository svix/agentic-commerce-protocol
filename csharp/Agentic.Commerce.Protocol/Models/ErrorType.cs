// this file is @generated
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ErrorType
    {
        [EnumMember(Value = "invalid_request")]
        InvalidRequest = 1,

        [EnumMember(Value = "request_not_idempotent")]
        RequestNotIdempotent = 2,

        [EnumMember(Value = "processing_error")]
        ProcessingError = 3,

        [EnumMember(Value = "service_unavailable")]
        ServiceUnavailable = 4,
    }
}
