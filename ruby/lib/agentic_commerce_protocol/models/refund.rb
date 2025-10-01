# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Refund
    attr_accessor :type
    attr_accessor :amount

    ALL_FIELD ||= ["type", "amount"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Refund` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Refund")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = AgenticCommerceProtocol::RefundType.deserialize(attributes["type"])
      attrs["amount"] = attributes["amount"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_schema_ref(@type) if @type
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
