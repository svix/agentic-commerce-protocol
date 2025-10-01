# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class PaymentProviderType
    STRIPE = "stripe".freeze

    def self.all_vars
      @all_vars ||= [STRIPE].freeze
    end

    def initialize(value)
      unless PaymentProviderType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #PaymentProviderType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if PaymentProviderType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #PaymentProviderType"
    end

    def serialize
      @value
    end
  end
end
