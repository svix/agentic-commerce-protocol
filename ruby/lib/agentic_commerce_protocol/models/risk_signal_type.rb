# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class RiskSignalType
    CARD_TESTING = "card_testing".freeze

    def self.all_vars
      @all_vars ||= [CARD_TESTING].freeze
    end

    def initialize(value)
      unless RiskSignalType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #RiskSignalType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if RiskSignalType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #RiskSignalType"
    end

    def serialize
      @value
    end
  end
end
