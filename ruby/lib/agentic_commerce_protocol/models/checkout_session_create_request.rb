# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class CheckoutSessionCreateRequest
    attr_accessor :buyer
    attr_accessor :items
    attr_accessor :fulfillment_address

    ALL_FIELD ||= ["buyer", "items", "fulfillment_address"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::CheckoutSessionCreateRequest` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::CheckoutSessionCreateRequest")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["buyer"] = AgenticCommerceProtocol::Buyer.deserialize(attributes["buyer"]) if attributes["buyer"]
      attrs["items"] = attributes["items"].map { |v| AgenticCommerceProtocol::Item.deserialize(v) }
      if attributes["fulfillment_address"]
        attrs["fulfillment_address"] = AgenticCommerceProtocol::Address.deserialize(attributes["fulfillment_address"])
      end

      new(attrs)
    end

    def serialize
      out = Hash.new
      out["buyer"] = AgenticCommerceProtocol::serialize_schema_ref(@buyer) if @buyer
      out["items"] = @items.map { |v| v.serialize } if @items
      if @fulfillment_address
        out["fulfillment_address"] = AgenticCommerceProtocol::serialize_schema_ref(@fulfillment_address)
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
