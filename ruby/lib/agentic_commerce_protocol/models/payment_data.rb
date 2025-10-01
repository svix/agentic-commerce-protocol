# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class PaymentData
    attr_accessor :token
    attr_accessor :provider
    attr_accessor :billing_address

    ALL_FIELD ||= ["token", "provider", "billing_address"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::PaymentData` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::PaymentData")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["token"] = attributes["token"]
      attrs["provider"] = AgenticCommerceProtocol::PaymentProviderType.deserialize(attributes["provider"])
      if attributes["billing_address"]
        attrs["billing_address"] = AgenticCommerceProtocol::Address.deserialize(attributes["billing_address"])
      end

      new(attrs)
    end

    def serialize
      out = Hash.new
      out["token"] = AgenticCommerceProtocol::serialize_primitive(@token) if @token
      out["provider"] = AgenticCommerceProtocol::serialize_schema_ref(@provider) if @provider
      out["billing_address"] = AgenticCommerceProtocol::serialize_schema_ref(@billing_address) if @billing_address
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
