# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class CheckoutSessionCompleteRequest
    attr_accessor :buyer
    attr_accessor :payment_data

    ALL_FIELD ||= ["buyer", "payment_data"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::CheckoutSessionCompleteRequest` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::CheckoutSessionCompleteRequest")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["buyer"] = AgenticCommerceProtocol::Buyer.deserialize(attributes["buyer"]) if attributes["buyer"]
      attrs["payment_data"] = AgenticCommerceProtocol::PaymentData.deserialize(attributes["payment_data"])
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["buyer"] = AgenticCommerceProtocol::serialize_schema_ref(@buyer) if @buyer
      out["payment_data"] = AgenticCommerceProtocol::serialize_schema_ref(@payment_data) if @payment_data
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
