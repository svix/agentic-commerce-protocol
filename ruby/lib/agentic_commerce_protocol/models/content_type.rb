# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class ContentType
    PLAIN = "plain".freeze
    MARKDOWN = "markdown".freeze

    def self.all_vars
      @all_vars ||= [PLAIN, MARKDOWN].freeze
    end

    def initialize(value)
      unless ContentType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #ContentType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if ContentType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #ContentType"
    end

    def serialize
      @value
    end
  end
end
