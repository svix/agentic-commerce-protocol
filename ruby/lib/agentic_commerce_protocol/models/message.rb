# frozen_string_literal: true
# This file is @generated
require "json"

require_relative "./message_error"
require_relative "./message_info"

module AgenticCommerceProtocol
  class MessageData
    class Info < MessageInfo
    end

    class Error < MessageError
    end
  end

  class Message
    attr_accessor :data

    ALL_FIELD ||= ["data"].freeze
    private_constant :ALL_FIELD
    TYPE_TO_NAME = {
      MessageData::Info => "info",
      MessageData::Error => "error"
    }
    private_constant :TYPE_TO_NAME
    NAME_TO_TYPE = TYPE_TO_NAME.invert
    private_constant :NAME_TO_TYPE

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Message` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Message")
        end

        if k == "data"
          unless TYPE_TO_NAME.key?(v.class)
            fail(ArgumentError, "The field #{k} can't be a `#{v.class}` expected one of #{TYPE_TO_NAME.keys}")
          end

          instance_variable_set("@__enum_discriminator", TYPE_TO_NAME[v.class])
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end

      if @__enum_discriminator.nil?
        fail(ArgumentError, "Required data field was not set")
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      unless NAME_TO_TYPE.key?(attributes["type"])
        fail(ArgumentError, "Invalid type `#{attributes["type"]}` expected on of #{NAME_TO_TYPE.keys}")
      end

      unless attributes.key?("data")
        fail(ArgumentError, "Missing required field data")
      end

      attrs["data"] = NAME_TO_TYPE[attributes["type"]].deserialize(attributes["data"])
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = @__enum_discriminator
      out["data"] = @data.serialize
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end

  end
end
