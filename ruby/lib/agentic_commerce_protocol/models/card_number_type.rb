# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class CardNumberType
    FPAN = "fpan".freeze
    NETWORK_TOKEN = "network_token".freeze

    def self.all_vars
      @all_vars ||= [FPAN, NETWORK_TOKEN].freeze
    end

    def initialize(value)
      unless CardNumberType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #CardNumberType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if CardNumberType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #CardNumberType"
    end

    def serialize
      @value
    end
  end
end
