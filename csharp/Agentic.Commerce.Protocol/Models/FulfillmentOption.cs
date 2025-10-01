// this file is @generated
using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(FulfillmentOptionConverter))]
    public class FulfillmentOption
    {
        [JsonIgnore]
        public required FulfillmentOptionData Data { get; set; }

        [JsonProperty("type")]
        private string Type => Data.GetDiscriminator();

        [JsonProperty("data")]
        private object realData
        {
            get => Data.GetContent();
            set => Data.SetContent(value);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("class FulfillmentOption {\n");
            sb.Append("  Data: ").Append(Data).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }

    public class FulfillmentOptionData
    {
        private object _value;
        private readonly DataType _type;

        internal string GetDiscriminator()
        {
            var memberInfo = typeof(DataType).GetMember(_type.ToString());
            var enumMember = memberInfo[0]
                .GetCustomAttributes(false)
                .OfType<EnumMemberAttribute>()
                .FirstOrDefault();
            return enumMember?.Value ?? _type.ToString().ToLower();
        }

        internal void SetContent(object value)
        {
            _value = value;
        }

        public object GetContent()
        {
            return _value;
        }

        private FulfillmentOptionData(object value, DataType type)
        {
            _value = value;
            _type = type;
        }

        public static FulfillmentOptionData Shipping(
            FulfillmentOptionShipping fulfillmentOptionShipping
        ) => new(fulfillmentOptionShipping, DataType.Shipping);

        public static FulfillmentOptionData Digital(
            FulfillmentOptionDigital fulfillmentOptionDigital
        ) => new(fulfillmentOptionDigital, DataType.Digital);

        private enum DataType
        {
            [EnumMember(Value = "shipping")]
            Shipping,

            [EnumMember(Value = "digital")]
            Digital,
        }

        public TResult Match<TResult>(
            Func<FulfillmentOptionShipping, TResult> onShipping,
            Func<FulfillmentOptionDigital, TResult> onDigital
        )
        {
            return _type switch
            {
                DataType.Shipping => onShipping((FulfillmentOptionShipping)_value),
                DataType.Digital => onDigital((FulfillmentOptionDigital)_value),
                // unreachable
                _ => throw new InvalidOperationException("Unknown data type"),
            };
        }

        public void Switch(
            Action<FulfillmentOptionShipping> onShipping,
            Action<FulfillmentOptionDigital> onDigital
        )
        {
            switch (_type)
            {
                case DataType.Shipping:
                    onShipping((FulfillmentOptionShipping)_value);
                    break;
                case DataType.Digital:
                    onDigital((FulfillmentOptionDigital)_value);
                    break;
                default:
                    // unreachable
                    throw new InvalidOperationException("Unknown data type");
            }
        }
    }

    internal class FulfillmentOptionSurrogate
    {
        [JsonProperty("type", Required = Required.Always)]
        public required string Type { get; set; }

        [JsonProperty("data", Required = Required.Always)]
        public required JObject Data { get; set; }
    }

    public class FulfillmentOptionConverter : JsonConverter
    {
        public override bool CanConvert(Type objectType)
        {
            return objectType == typeof(FulfillmentOption);
        }

        public override bool CanWrite
        {
            get { return false; }
        }

        public override void WriteJson(JsonWriter writer, object? value, JsonSerializer serializer)
        {
            // unreachable: CanWrite tells Newtonsoft not to call this method
            throw new NotImplementedException();
        }

        public override object ReadJson(
            JsonReader reader,
            Type objectType,
            object? existingValue,
            JsonSerializer serializer
        )
        {
            var surrogate =
                serializer.Deserialize<FulfillmentOptionSurrogate>(reader)
                ?? throw new JsonSerializationException(
                    "Failed to deserialize JSON to FulfillmentOptionSurrogate"
                );
            if (
                !typeMap.TryGetValue(
                    surrogate.Type,
                    out Func<(JObject, string), FulfillmentOptionData>? func
                )
            )
            {
                throw new JsonSerializationException(
                    $"Unexpected type {surrogate.Type} for FulfillmentOptionData.data"
                );
            }

            FulfillmentOptionData data = func((surrogate.Data, surrogate.Type));

            return new FulfillmentOption { Data = data };
        }

        private static T ToObj<T>((JObject, string) args)
        {
            var loadedObj =
                args.Item1.ToObject<T>()
                ?? throw new JsonSerializationException($"Failed to deserialize {args.Item2} data");
            return loadedObj;
        }

        private readonly Dictionary<
            string,
            Func<(JObject, string), FulfillmentOptionData>
        > typeMap = new()
        {
            ["shipping"] = c => FulfillmentOptionData.Shipping(ToObj<FulfillmentOptionShipping>(c)),
            ["digital"] = c => FulfillmentOptionData.Digital(ToObj<FulfillmentOptionDigital>(c)),
        };
    }
}
