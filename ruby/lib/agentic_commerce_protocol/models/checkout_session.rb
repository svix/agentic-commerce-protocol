# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class CheckoutSession
    attr_accessor :id
    attr_accessor :buyer
    attr_accessor :payment_provider
    attr_accessor :status
    attr_accessor :currency
    attr_accessor :line_items
    attr_accessor :fulfillment_address
    attr_accessor :fulfillment_options
    attr_accessor :fulfillment_option_id
    attr_accessor :totals
    attr_accessor :messages
    attr_accessor :links
    attr_accessor :order

    ALL_FIELD ||= [
      "id",
      "buyer",
      "payment_provider",
      "status",
      "currency",
      "line_items",
      "fulfillment_address",
      "fulfillment_options",
      "fulfillment_option_id",
      "totals",
      "messages",
      "links",
      "order"
    ].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::CheckoutSession` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::CheckoutSession")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["id"] = attributes["id"]
      attrs["buyer"] = AgenticCommerceProtocol::Buyer.deserialize(attributes["buyer"]) if attributes["buyer"]
      if attributes["payment_provider"]
        attrs["payment_provider"] = AgenticCommerceProtocol::PaymentProvider.deserialize(attributes["payment_provider"])
      end

      attrs["status"] = AgenticCommerceProtocol::CheckoutSessionStatus.deserialize(attributes["status"])
      attrs["currency"] = attributes["currency"]
      attrs["line_items"] = attributes["line_items"].map { |v| AgenticCommerceProtocol::LineItem.deserialize(v) }
      if attributes["fulfillment_address"]
        attrs["fulfillment_address"] = AgenticCommerceProtocol::Address.deserialize(attributes["fulfillment_address"])
      end

      attrs["fulfillment_options"] = attributes["fulfillment_options"].map { |v|
        AgenticCommerceProtocol::FulfillmentOption.deserialize(v)
      }
      attrs["fulfillment_option_id"] = attributes["fulfillment_option_id"]
      attrs["totals"] = attributes["totals"].map { |v| AgenticCommerceProtocol::Total.deserialize(v) }
      attrs["messages"] = attributes["messages"].map { |v| AgenticCommerceProtocol::Message.deserialize(v) }
      attrs["links"] = attributes["links"].map { |v| AgenticCommerceProtocol::Link.deserialize(v) }
      attrs["order"] = AgenticCommerceProtocol::Order.deserialize(attributes["order"]) if attributes["order"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["id"] = AgenticCommerceProtocol::serialize_primitive(@id) if @id
      out["buyer"] = AgenticCommerceProtocol::serialize_schema_ref(@buyer) if @buyer
      out["payment_provider"] = AgenticCommerceProtocol::serialize_schema_ref(@payment_provider) if @payment_provider
      out["status"] = AgenticCommerceProtocol::serialize_schema_ref(@status) if @status
      out["currency"] = AgenticCommerceProtocol::serialize_primitive(@currency) if @currency
      out["line_items"] = @line_items.map { |v| v.serialize } if @line_items
      if @fulfillment_address
        out["fulfillment_address"] = AgenticCommerceProtocol::serialize_schema_ref(@fulfillment_address)
      end

      out["fulfillment_options"] = @fulfillment_options.map { |v| v.serialize } if @fulfillment_options
      if @fulfillment_option_id
        out["fulfillment_option_id"] = AgenticCommerceProtocol::serialize_primitive(@fulfillment_option_id)
      end

      out["totals"] = @totals.map { |v| v.serialize } if @totals
      out["messages"] = @messages.map { |v| v.serialize } if @messages
      out["links"] = @links.map { |v| v.serialize } if @links
      out["order"] = AgenticCommerceProtocol::serialize_schema_ref(@order) if @order
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
