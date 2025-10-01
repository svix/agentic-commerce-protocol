# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class WebhookEventType
    ORDER_CREATE = "order_create".freeze
    ORDER_UPDATE = "order_update".freeze

    def self.all_vars
      @all_vars ||= [ORDER_CREATE, ORDER_UPDATE].freeze
    end

    def initialize(value)
      unless WebhookEventType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #WebhookEventType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if WebhookEventType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #WebhookEventType"
    end

    def serialize
      @value
    end
  end
end
