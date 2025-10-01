# frozen_string_literal: true
# This file is @generated
module AgenticCommerceProtocol
  class LinkType
    TERMS_OF_USE = "terms_of_use".freeze
    PRIVACY_POLICY = "privacy_policy".freeze
    SELLER_SHOP_POLICIES = "seller_shop_policies".freeze

    def self.all_vars
      @all_vars ||= [TERMS_OF_USE, PRIVACY_POLICY, SELLER_SHOP_POLICIES].freeze
    end

    def initialize(value)
      unless LinkType.all_vars.include?(value)
        raise "Invalid ENUM value '#{value}' for class #LinkType"
      end

      @value = value
    end

    def self.deserialize(value)
      return value if LinkType.all_vars.include?(value)
      raise "Invalid ENUM value '#{value}' for class #LinkType"
    end

    def serialize
      @value
    end
  end
end
