# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class FulfillmentOptionDigital
    attr_accessor :id
    attr_accessor :title
    attr_accessor :subtitle
    attr_accessor :subtotal
    attr_accessor :tax
    attr_accessor :total

    ALL_FIELD ||= ["id", "title", "subtitle", "subtotal", "tax", "total"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::FulfillmentOptionDigital` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::FulfillmentOptionDigital")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["id"] = attributes["id"]
      attrs["title"] = attributes["title"]
      attrs["subtitle"] = attributes["subtitle"]
      attrs["subtotal"] = attributes["subtotal"]
      attrs["tax"] = attributes["tax"]
      attrs["total"] = attributes["total"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["id"] = AgenticCommerceProtocol::serialize_primitive(@id) if @id
      out["title"] = AgenticCommerceProtocol::serialize_primitive(@title) if @title
      out["subtitle"] = AgenticCommerceProtocol::serialize_primitive(@subtitle) if @subtitle
      out["subtotal"] = AgenticCommerceProtocol::serialize_primitive(@subtotal) if @subtotal
      out["tax"] = AgenticCommerceProtocol::serialize_primitive(@tax) if @tax
      out["total"] = AgenticCommerceProtocol::serialize_primitive(@total) if @total
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
