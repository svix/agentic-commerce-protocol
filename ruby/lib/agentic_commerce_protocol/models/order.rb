# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Order
    attr_accessor :id
    attr_accessor :checkout_session_id
    attr_accessor :permalink_url

    ALL_FIELD ||= ["id", "checkout_session_id", "permalink_url"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Order` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Order")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["id"] = attributes["id"]
      attrs["checkout_session_id"] = attributes["checkout_session_id"]
      attrs["permalink_url"] = attributes["permalink_url"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["id"] = AgenticCommerceProtocol::serialize_primitive(@id) if @id
      if @checkout_session_id
        out["checkout_session_id"] = AgenticCommerceProtocol::serialize_primitive(@checkout_session_id)
      end

      out["permalink_url"] = AgenticCommerceProtocol::serialize_primitive(@permalink_url) if @permalink_url
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
