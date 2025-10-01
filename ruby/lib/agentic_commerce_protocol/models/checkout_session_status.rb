# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class CheckoutSessionStatus
    NOT_READY_FOR_PAYMENT = "not_ready_for_payment".freeze
    READY_FOR_PAYMENT = "ready_for_payment".freeze
    COMPLETED = "completed".freeze
    CANCELED = "canceled".freeze
    IN_PROGRESS = "in_progress".freeze

    def self.all_vars
      @all_vars ||= [NOT_READY_FOR_PAYMENT, READY_FOR_PAYMENT, COMPLETED, CANCELED, IN_PROGRESS].freeze
    end

    def initialize(value)
      unless CheckoutSessionStatus.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #CheckoutSessionStatus"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if CheckoutSessionStatus.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #CheckoutSessionStatus"
    end

    def serialize
      @value
    end
  end
end
