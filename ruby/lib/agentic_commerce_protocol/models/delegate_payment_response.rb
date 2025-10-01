# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class DelegatePaymentResponse
    attr_accessor :id
    attr_accessor :created
    attr_accessor :metadata

    ALL_FIELD ||= ["id", "created", "metadata"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::DelegatePaymentResponse` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::DelegatePaymentResponse")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["id"] = attributes["id"]
      attrs["created"] = attributes["created"]
      attrs["metadata"] = attributes["metadata"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["id"] = AgenticCommerceProtocol::serialize_primitive(@id) if @id
      out["created"] = AgenticCommerceProtocol::serialize_primitive(@created) if @created
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
