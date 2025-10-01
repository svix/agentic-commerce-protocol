# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class TotalType
    ITEMS_BASE_AMOUNT = "items_base_amount".freeze
    ITEMS_DISCOUNT = "items_discount".freeze
    SUBTOTAL = "subtotal".freeze
    DISCOUNT = "discount".freeze
    FULFILLMENT = "fulfillment".freeze
    TAX = "tax".freeze
    FEE = "fee".freeze
    TOTAL = "total".freeze

    def self.all_vars
      @all_vars ||= [ITEMS_BASE_AMOUNT, ITEMS_DISCOUNT, SUBTOTAL, DISCOUNT, FULFILLMENT, TAX, FEE, TOTAL].freeze
    end

    def initialize(value)
      unless TotalType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #TotalType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if TotalType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #TotalType"
    end

    def serialize
      @value
    end
  end
end
