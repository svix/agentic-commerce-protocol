# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class PaymentProvider
    attr_accessor :provider
    attr_accessor :supported_payment_methods

    ALL_FIELD ||= ["provider", "supported_payment_methods"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::PaymentProvider` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::PaymentProvider")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["provider"] = AgenticCommerceProtocol::PaymentProviderType.deserialize(attributes["provider"])
      attrs["supported_payment_methods"] = attributes["supported_payment_methods"].map { |v|
        AgenticCommerceProtocol::PaymentMethodType.deserialize(v)
      }
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["provider"] = AgenticCommerceProtocol::serialize_schema_ref(@provider) if @provider
      if @supported_payment_methods
        out["supported_payment_methods"] = @supported_payment_methods.map { |v| v.serialize }
      end

      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
