# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class LineItem
    attr_accessor :id
    attr_accessor :item
    attr_accessor :base_amount
    attr_accessor :discount
    attr_accessor :subtotal
    attr_accessor :tax
    attr_accessor :total

    ALL_FIELD ||= ["id", "item", "base_amount", "discount", "subtotal", "tax", "total"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::LineItem` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::LineItem")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["id"] = attributes["id"]
      attrs["item"] = AgenticCommerceProtocol::Item.deserialize(attributes["item"])
      attrs["base_amount"] = attributes["base_amount"]
      attrs["discount"] = attributes["discount"]
      attrs["subtotal"] = attributes["subtotal"]
      attrs["tax"] = attributes["tax"]
      attrs["total"] = attributes["total"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["id"] = AgenticCommerceProtocol::serialize_primitive(@id) if @id
      out["item"] = AgenticCommerceProtocol::serialize_schema_ref(@item) if @item
      out["base_amount"] = AgenticCommerceProtocol::serialize_primitive(@base_amount) if @base_amount
      out["discount"] = AgenticCommerceProtocol::serialize_primitive(@discount) if @discount
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
