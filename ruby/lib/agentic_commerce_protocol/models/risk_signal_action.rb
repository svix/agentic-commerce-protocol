# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class RiskSignalAction
    BLOCKED = "blocked".freeze
    MANUAL_REVIEW = "manual_review".freeze
    AUTHORIZED = "authorized".freeze

    def self.all_vars
      @all_vars ||= [BLOCKED, MANUAL_REVIEW, AUTHORIZED].freeze
    end

    def initialize(value)
      unless RiskSignalAction.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #RiskSignalAction"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if RiskSignalAction.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #RiskSignalAction"
    end

    def serialize
      @value
    end
  end
end
