# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class EventDataOrder
    attr_accessor :type
    attr_accessor :checkout_session_id
    attr_accessor :permalink_url
    attr_accessor :status
    attr_accessor :refunds

    ALL_FIELD ||= ["type", "checkout_session_id", "permalink_url", "status", "refunds"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::EventDataOrder` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::EventDataOrder")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = attributes["type"]
      attrs["checkout_session_id"] = attributes["checkout_session_id"]
      attrs["permalink_url"] = attributes["permalink_url"]
      attrs["status"] = AgenticCommerceProtocol::WebhookOrderStatus.deserialize(attributes["status"])
      attrs["refunds"] = attributes["refunds"].map { |v| AgenticCommerceProtocol::Refund.deserialize(v) }
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_primitive(@type) if @type
      if @checkout_session_id
        out["checkout_session_id"] = AgenticCommerceProtocol::serialize_primitive(@checkout_session_id)
      end

      out["permalink_url"] = AgenticCommerceProtocol::serialize_primitive(@permalink_url) if @permalink_url
      out["status"] = AgenticCommerceProtocol::serialize_schema_ref(@status) if @status
      out["refunds"] = @refunds.map { |v| v.serialize } if @refunds
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
