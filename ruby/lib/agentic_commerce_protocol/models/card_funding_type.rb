# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class CardFundingType
    CREDIT = "credit".freeze
    DEBIT = "debit".freeze
    PREPAID = "prepaid".freeze

    def self.all_vars
      @all_vars ||= [CREDIT, DEBIT, PREPAID].freeze
    end

    def initialize(value)
      unless CardFundingType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #CardFundingType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if CardFundingType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #CardFundingType"
    end

    def serialize
      @value
    end
  end
end
