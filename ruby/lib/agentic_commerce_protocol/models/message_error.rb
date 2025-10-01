# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class MessageError
    attr_accessor :code
    attr_accessor :param
    attr_accessor :content_type
    attr_accessor :content

    ALL_FIELD ||= ["code", "param", "content_type", "content"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::MessageError` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::MessageError")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["code"] = AgenticCommerceProtocol::ErrorCode.deserialize(attributes["code"])
      attrs["param"] = attributes["param"]
      attrs["content_type"] = AgenticCommerceProtocol::ContentType.deserialize(attributes["content_type"])
      attrs["content"] = attributes["content"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["code"] = AgenticCommerceProtocol::serialize_schema_ref(@code) if @code
      out["param"] = AgenticCommerceProtocol::serialize_primitive(@param) if @param
      out["content_type"] = AgenticCommerceProtocol::serialize_schema_ref(@content_type) if @content_type
      out["content"] = AgenticCommerceProtocol::serialize_primitive(@content) if @content
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
