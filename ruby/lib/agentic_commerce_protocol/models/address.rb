# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Address
    attr_accessor :name
    attr_accessor :line_one
    attr_accessor :line_two
    attr_accessor :city
    attr_accessor :state
    attr_accessor :country
    attr_accessor :postal_code

    ALL_FIELD ||= ["name", "line_one", "line_two", "city", "state", "country", "postal_code"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Address` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Address")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["name"] = attributes["name"]
      attrs["line_one"] = attributes["line_one"]
      attrs["line_two"] = attributes["line_two"]
      attrs["city"] = attributes["city"]
      attrs["state"] = attributes["state"]
      attrs["country"] = attributes["country"]
      attrs["postal_code"] = attributes["postal_code"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["name"] = AgenticCommerceProtocol::serialize_primitive(@name) if @name
      out["line_one"] = AgenticCommerceProtocol::serialize_primitive(@line_one) if @line_one
      out["line_two"] = AgenticCommerceProtocol::serialize_primitive(@line_two) if @line_two
      out["city"] = AgenticCommerceProtocol::serialize_primitive(@city) if @city
      out["state"] = AgenticCommerceProtocol::serialize_primitive(@state) if @state
      out["country"] = AgenticCommerceProtocol::serialize_primitive(@country) if @country
      out["postal_code"] = AgenticCommerceProtocol::serialize_primitive(@postal_code) if @postal_code
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
