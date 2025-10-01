# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class WebhookEvent
    attr_accessor :type
    attr_accessor :data

    ALL_FIELD ||= ["type", "data"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::WebhookEvent` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::WebhookEvent")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["type"] = AgenticCommerceProtocol::WebhookEventType.deserialize(attributes["type"])
      attrs["data"] = AgenticCommerceProtocol::EventDataOrder.deserialize(attributes["data"])
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["type"] = AgenticCommerceProtocol::serialize_schema_ref(@type) if @type
      out["data"] = AgenticCommerceProtocol::serialize_schema_ref(@data) if @data
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
