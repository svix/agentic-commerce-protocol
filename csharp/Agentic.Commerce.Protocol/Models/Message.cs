// this file is @generated
using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace Agentic.Commerce.Protocol
{
    [JsonConverter(typeof(MessageConverter))]
    public class Message
    {
        [JsonIgnore]
        public required MessageData Data { get; set; }

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

            sb.Append("class Message {\n");
            sb.Append("  Data: ").Append(Data).Append('\n');
            sb.Append("}\n");
            return sb.ToString();
        }
    }

    public class MessageData
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

        private MessageData(object value, DataType type)
        {
            _value = value;
            _type = type;
        }

        public static MessageData Info(MessageInfo messageInfo) => new(messageInfo, DataType.Info);

        public static MessageData Error(MessageError messageError) =>
            new(messageError, DataType.Error);

        private enum DataType
        {
            [EnumMember(Value = "info")]
            Info,

            [EnumMember(Value = "error")]
            Error,
        }

        public TResult Match<TResult>(
            Func<MessageInfo, TResult> onInfo,
            Func<MessageError, TResult> onError
        )
        {
            return _type switch
            {
                DataType.Info => onInfo((MessageInfo)_value),
                DataType.Error => onError((MessageError)_value),
                // unreachable
                _ => throw new InvalidOperationException("Unknown data type"),
            };
        }

        public void Switch(Action<MessageInfo> onInfo, Action<MessageError> onError)
        {
            switch (_type)
            {
                case DataType.Info:
                    onInfo((MessageInfo)_value);
                    break;
                case DataType.Error:
                    onError((MessageError)_value);
                    break;
                default:
                    // unreachable
                    throw new InvalidOperationException("Unknown data type");
            }
        }
    }

    internal class MessageSurrogate
    {
        [JsonProperty("type", Required = Required.Always)]
        public required string Type { get; set; }

        [JsonProperty("data", Required = Required.Always)]
        public required JObject Data { get; set; }
    }

    public class MessageConverter : JsonConverter
    {
        public override bool CanConvert(Type objectType)
        {
            return objectType == typeof(Message);
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
                serializer.Deserialize<MessageSurrogate>(reader)
                ?? throw new JsonSerializationException(
                    "Failed to deserialize JSON to MessageSurrogate"
                );
            if (
                !typeMap.TryGetValue(surrogate.Type, out Func<(JObject, string), MessageData>? func)
            )
            {
                throw new JsonSerializationException(
                    $"Unexpected type {surrogate.Type} for MessageData.data"
                );
            }

            MessageData data = func((surrogate.Data, surrogate.Type));

            return new Message { Data = data };
        }

        private static T ToObj<T>((JObject, string) args)
        {
            var loadedObj =
                args.Item1.ToObject<T>()
                ?? throw new JsonSerializationException($"Failed to deserialize {args.Item2} data");
            return loadedObj;
        }

        private readonly Dictionary<string, Func<(JObject, string), MessageData>> typeMap = new()
        {
            ["info"] = c => MessageData.Info(ToObj<MessageInfo>(c)),
            ["error"] = c => MessageData.Error(ToObj<MessageError>(c)),
        };
    }
}
