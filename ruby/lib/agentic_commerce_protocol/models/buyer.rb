# frozen_string_literal: true
# This file is @generated
require "json"

module AgenticCommerceProtocol
  class Buyer
    attr_accessor :first_name
    attr_accessor :last_name
    attr_accessor :email
    attr_accessor :phone_number

    ALL_FIELD ||= ["first_name", "last_name", "email", "phone_number"].freeze
    private_constant :ALL_FIELD

    def initialize(attributes = {})
      unless attributes.is_a?(Hash)
        fail(
          ArgumentError,
          "The input argument (attributes) must be a hash in `AgenticCommerceProtocol::Buyer` new method"
        )
      end

      attributes.each do |k, v|
        unless ALL_FIELD.include?(k.to_s)
          fail(ArgumentError, "The field #{k} is not part of AgenticCommerceProtocol::Buyer")
        end

        instance_variable_set("@#{k}", v)
        instance_variable_set("@__#{k}_is_defined", true)
      end
    end

    def self.deserialize(attributes = {})
      attributes = attributes.transform_keys(&:to_s)
      attrs = Hash.new
      attrs["first_name"] = attributes["first_name"]
      attrs["last_name"] = attributes["last_name"]
      attrs["email"] = attributes["email"]
      attrs["phone_number"] = attributes["phone_number"]
      new(attrs)
    end

    def serialize
      out = Hash.new
      out["first_name"] = AgenticCommerceProtocol::serialize_primitive(@first_name) if @first_name
      out["last_name"] = AgenticCommerceProtocol::serialize_primitive(@last_name) if @last_name
      out["email"] = AgenticCommerceProtocol::serialize_primitive(@email) if @email
      out["phone_number"] = AgenticCommerceProtocol::serialize_primitive(@phone_number) if @phone_number
      out
    end

    # Serializes the object to a json string
    # @return String
    def to_json
      JSON.dump(serialize)
    end
  end
end
