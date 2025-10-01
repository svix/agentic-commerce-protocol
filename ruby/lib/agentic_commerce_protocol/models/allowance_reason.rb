# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class AllowanceReason
    ONE_TIME = "one_time".freeze

    def self.all_vars
      @all_vars ||= [ONE_TIME].freeze
    end

    def initialize(value)
      unless AllowanceReason.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #AllowanceReason"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if AllowanceReason.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #AllowanceReason"
    end

    def serialize
      @value
    end
  end
end
