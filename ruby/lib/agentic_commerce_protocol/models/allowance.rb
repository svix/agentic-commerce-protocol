# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Allowance
    attr_accessor :reason
    attr_accessor :max_amount
    attr_accessor :currency
    attr_accessor :checkout_session_id
    attr_accessor :merchant_id
    attr_accessor :expires_at

    ALL_FIELD ||= ["reason", "max_amount", "currency", "checkout_session_id", "merchant_id", "expires_at"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Allowance` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Allowance")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["reason"] = AgenticCommerceProtocol::AllowanceReason.deserialize(attributes["reason"])
      attrs["max_amount"] = attributes["max_amount"]
      attrs["currency"] = attributes["currency"]
      attrs["checkout_session_id"] = attributes["checkout_session_id"]
      attrs["merchant_id"] = attributes["merchant_id"]
      attrs["expires_at"] = attributes["expires_at"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["reason"] = AgenticCommerceProtocol::serialize_schema_ref(@reason) if @reason
      out["max_amount"] = AgenticCommerceProtocol::serialize_primitive(@max_amount) if @max_amount
      out["currency"] = AgenticCommerceProtocol::serialize_primitive(@currency) if @currency
      if @checkout_session_id
        out["checkout_session_id"] = AgenticCommerceProtocol::serialize_primitive(@checkout_session_id)
      end

      out["merchant_id"] = AgenticCommerceProtocol::serialize_primitive(@merchant_id) if @merchant_id
      out["expires_at"] = AgenticCommerceProtocol::serialize_primitive(@expires_at) if @expires_at
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
