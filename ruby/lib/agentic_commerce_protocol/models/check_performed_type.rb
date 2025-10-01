# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class CheckPerformedType
    AVS = "avs".freeze
    CVV = "cvv".freeze
    ANI = "ani".freeze
    AUTH0 = "auth0".freeze

    def self.all_vars
      @all_vars ||= [AVS, CVV, ANI, AUTH0].freeze
    end

    def initialize(value)
      unless CheckPerformedType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #CheckPerformedType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if CheckPerformedType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #CheckPerformedType"
    end

    def serialize
      @value
    end
  end
end
