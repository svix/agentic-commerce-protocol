# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class DelegatePaymentRequest
    attr_accessor :payment_method
    attr_accessor :allowance
    attr_accessor :billing_address
    attr_accessor :risk_signals
    attr_accessor :metadata

    ALL_FIELD ||= ["payment_method", "allowance", "billing_address", "risk_signals", "metadata"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::DelegatePaymentRequest` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::DelegatePaymentRequest")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["payment_method"] = AgenticCommerceProtocol::PaymentMethodCard.deserialize(attributes["payment_method"])
      attrs["allowance"] = AgenticCommerceProtocol::Allowance.deserialize(attributes["allowance"])
      if attributes["billing_address"]
        attrs["billing_address"] = AgenticCommerceProtocol::Address.deserialize(attributes["billing_address"])
      end

      attrs["risk_signals"] = attributes["risk_signals"].map { |v| AgenticCommerceProtocol::RiskSignal.deserialize(v) }
      attrs["metadata"] = attributes["metadata"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["payment_method"] = AgenticCommerceProtocol::serialize_schema_ref(@payment_method) if @payment_method
      out["allowance"] = AgenticCommerceProtocol::serialize_schema_ref(@allowance) if @allowance
      out["billing_address"] = AgenticCommerceProtocol::serialize_schema_ref(@billing_address) if @billing_address
      out["risk_signals"] = @risk_signals.map { |v| v.serialize } if @risk_signals
      out["metadata"] = AgenticCommerceProtocol::serialize_primitive(@metadata) if @metadata
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
