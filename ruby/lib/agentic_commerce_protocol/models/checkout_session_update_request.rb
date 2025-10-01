# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class CheckoutSessionUpdateRequest
    attr_accessor :buyer
    attr_accessor :items
    attr_accessor :fulfillment_address
    attr_accessor :fulfillment_option_id

    ALL_FIELD ||= ["buyer", "items", "fulfillment_address", "fulfillment_option_id"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::CheckoutSessionUpdateRequest` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::CheckoutSessionUpdateRequest")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["buyer"] = AgenticCommerceProtocol::Buyer.deserialize(attributes["buyer"]) if attributes["buyer"]
      if attributes["items"]
        attrs["items"] = attributes["items"].map { |v| AgenticCommerceProtocol::Item.deserialize(v) }
      end

      if attributes["fulfillment_address"]
        attrs["fulfillment_address"] = AgenticCommerceProtocol::Address.deserialize(attributes["fulfillment_address"])
      end

      attrs["fulfillment_option_id"] = attributes["fulfillment_option_id"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["buyer"] = AgenticCommerceProtocol::serialize_schema_ref(@buyer) if @buyer
      out["items"] = @items.map { |v| v.serialize } if @items
      if @fulfillment_address
        out["fulfillment_address"] = AgenticCommerceProtocol::serialize_schema_ref(@fulfillment_address)
      end

      if @fulfillment_option_id
        out["fulfillment_option_id"] = AgenticCommerceProtocol::serialize_primitive(@fulfillment_option_id)
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
