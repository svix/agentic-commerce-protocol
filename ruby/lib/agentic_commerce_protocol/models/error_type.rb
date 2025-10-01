# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class ErrorType
    INVALID_REQUEST = "invalid_request".freeze
    REQUEST_NOT_IDEMPOTENT = "request_not_idempotent".freeze
    PROCESSING_ERROR = "processing_error".freeze
    SERVICE_UNAVAILABLE = "service_unavailable".freeze

    def self.all_vars
      @all_vars ||= [INVALID_REQUEST, REQUEST_NOT_IDEMPOTENT, PROCESSING_ERROR, SERVICE_UNAVAILABLE].freeze
    end

    def initialize(value)
      unless ErrorType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #ErrorType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if ErrorType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #ErrorType"
    end

    def serialize
      @value
    end
  end
end
