# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Error
    attr_accessor :type
    attr_accessor :code
    attr_accessor :message
    attr_accessor :param

    ALL_FIELD ||= ["type", "code", "message", "param"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Error` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Error")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = AgenticCommerceProtocol::ErrorType.deserialize(attributes["type"])
      attrs["code"] = attributes["code"]
      attrs["message"] = attributes["message"]
      attrs["param"] = attributes["param"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_schema_ref(@type) if @type
      out["code"] = AgenticCommerceProtocol::serialize_primitive(@code) if @code
      out["message"] = AgenticCommerceProtocol::serialize_primitive(@message) if @message
      out["param"] = AgenticCommerceProtocol::serialize_primitive(@param) if @param
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
