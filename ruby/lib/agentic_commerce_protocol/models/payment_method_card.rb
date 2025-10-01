# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class PaymentMethodCard
    attr_accessor :type
    attr_accessor :card_number_type
    attr_accessor :number
    attr_accessor :exp_month
    attr_accessor :exp_year
    attr_accessor :name
    attr_accessor :cvc
    attr_accessor :cryptogram
    attr_accessor :eci_value
    attr_accessor :checks_performed
    attr_accessor :iin
    attr_accessor :display_card_funding_type
    attr_accessor :display_wallet_type
    attr_accessor :display_brand
    attr_accessor :display_last4
    attr_accessor :metadata

    ALL_FIELD ||= [
      "type",
      "card_number_type",
      "number",
      "exp_month",
      "exp_year",
      "name",
      "cvc",
      "cryptogram",
      "eci_value",
      "checks_performed",
      "iin",
      "display_card_funding_type",
      "display_wallet_type",
      "display_brand",
      "display_last4",
      "metadata"
    ].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::PaymentMethodCard` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::PaymentMethodCard")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = attributes["type"]
      attrs["card_number_type"] = AgenticCommerceProtocol::CardNumberType.deserialize(attributes["card_number_type"])
      attrs["number"] = attributes["number"]
      attrs["exp_month"] = attributes["exp_month"]
      attrs["exp_year"] = attributes["exp_year"]
      attrs["name"] = attributes["name"]
      attrs["cvc"] = attributes["cvc"]
      attrs["cryptogram"] = attributes["cryptogram"]
      attrs["eci_value"] = attributes["eci_value"]
      if attributes["checks_performed"]
        attrs["checks_performed"] = attributes["checks_performed"].map { |v|
          AgenticCommerceProtocol::CheckPerformedType.deserialize(v)
        }
      end

      attrs["iin"] = attributes["iin"]
      attrs["display_card_funding_type"] = AgenticCommerceProtocol::CardFundingType.deserialize(
        attributes["display_card_funding_type"]
      )
      attrs["display_wallet_type"] = attributes["display_wallet_type"]
      attrs["display_brand"] = attributes["display_brand"]
      attrs["display_last4"] = attributes["display_last4"]
      attrs["metadata"] = attributes["metadata"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_primitive(@type) if @type
      out["card_number_type"] = AgenticCommerceProtocol::serialize_schema_ref(@card_number_type) if @card_number_type
      out["number"] = AgenticCommerceProtocol::serialize_primitive(@number) if @number
      out["exp_month"] = AgenticCommerceProtocol::serialize_primitive(@exp_month) if @exp_month
      out["exp_year"] = AgenticCommerceProtocol::serialize_primitive(@exp_year) if @exp_year
      out["name"] = AgenticCommerceProtocol::serialize_primitive(@name) if @name
      out["cvc"] = AgenticCommerceProtocol::serialize_primitive(@cvc) if @cvc
      out["cryptogram"] = AgenticCommerceProtocol::serialize_primitive(@cryptogram) if @cryptogram
      out["eci_value"] = AgenticCommerceProtocol::serialize_primitive(@eci_value) if @eci_value
      out["checks_performed"] = @checks_performed.map { |v| v.serialize } if @checks_performed
      out["iin"] = AgenticCommerceProtocol::serialize_primitive(@iin) if @iin
      if @display_card_funding_type
        out["display_card_funding_type"] = AgenticCommerceProtocol::serialize_schema_ref(@display_card_funding_type)
      end

      if @display_wallet_type
        out["display_wallet_type"] = AgenticCommerceProtocol::serialize_primitive(@display_wallet_type)
      end

      out["display_brand"] = AgenticCommerceProtocol::serialize_primitive(@display_brand) if @display_brand
      out["display_last4"] = AgenticCommerceProtocol::serialize_primitive(@display_last4) if @display_last4
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
