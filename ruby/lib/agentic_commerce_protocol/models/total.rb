# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Total
    attr_accessor :type
    attr_accessor :display_text
    attr_accessor :amount

    ALL_FIELD ||= ["type", "display_text", "amount"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Total` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Total")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = AgenticCommerceProtocol::TotalType.deserialize(attributes["type"])
      attrs["display_text"] = attributes["display_text"]
      attrs["amount"] = attributes["amount"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_schema_ref(@type) if @type
      out["display_text"] = AgenticCommerceProtocol::serialize_primitive(@display_text) if @display_text
      out["amount"] = AgenticCommerceProtocol::serialize_primitive(@amount) if @amount
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
