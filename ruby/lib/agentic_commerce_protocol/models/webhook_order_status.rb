# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class WebhookOrderStatus
    CREATED = "created".freeze
    MANUAL_REVIEW = "manual_review".freeze
    CONFIRMED = "confirmed".freeze
    CANCELED = "canceled".freeze
    SHIPPED = "shipped".freeze
    FULFILLED = "fulfilled".freeze

    def self.all_vars
      @all_vars ||= [CREATED, MANUAL_REVIEW, CONFIRMED, CANCELED, SHIPPED, FULFILLED].freeze
    end

    def initialize(value)
      unless WebhookOrderStatus.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #WebhookOrderStatus"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if WebhookOrderStatus.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #WebhookOrderStatus"
    end

    def serialize
      @value
    end
  end
end
