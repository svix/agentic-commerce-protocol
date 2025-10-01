# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class ErrorCode
    MISSING = "missing".freeze
    INVALID = "invalid".freeze
    OUT_OF_STOCK = "out_of_stock".freeze
    PAYMENT_DECLINED = "payment_declined".freeze
    REQUIRES_SIGN_IN = "requires_sign_in".freeze
    REQUIRES_3DS = "requires_3ds".freeze

    def self.all_vars
      @all_vars ||= [MISSING, INVALID, OUT_OF_STOCK, PAYMENT_DECLINED, REQUIRES_SIGN_IN, REQUIRES_3DS].freeze
    end

    def initialize(value)
      unless ErrorCode.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #ErrorCode"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if ErrorCode.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #ErrorCode"
    end

    def serialize
      @value
    end
  end
end
