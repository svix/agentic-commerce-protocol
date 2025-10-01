# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class PaymentMethodType
    CARD = "card".freeze

    def self.all_vars
      @all_vars ||= [CARD].freeze
    end

    def initialize(value)
      unless PaymentMethodType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #PaymentMethodType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if PaymentMethodType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #PaymentMethodType"
    end

    def serialize
      @value
    end
  end
end
