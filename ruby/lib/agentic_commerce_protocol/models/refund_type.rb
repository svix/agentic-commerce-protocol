# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class RefundType
    STORE_CREDIT = "store_credit".freeze
    ORIGINAL_PAYMENT = "original_payment".freeze

    def self.all_vars
      @all_vars ||= [STORE_CREDIT, ORIGINAL_PAYMENT].freeze
    end

    def initialize(value)
      unless RefundType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #RefundType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if RefundType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #RefundType"
    end

    def serialize
      @value
    end
  end
end
