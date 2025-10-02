Gem::Specification.new do |spec|
  spec.name          = "agentic-commerce-protocol"
  spec.version       = "0.2.0"
  spec.authors       = ["Svix"]
  spec.email         = []

  spec.summary       = "Type definitions for the Agentic Commerce Protocol specification"
  spec.description   = "Type definitions for the Agentic Commerce Protocol specification"
  spec.homepage      = "https://github.com/svix/agentic-commerce-protocol"
  spec.license       = "MIT"
  spec.required_ruby_version = ">= 3.2.0"

  spec.metadata["homepage_uri"] = spec.homepage
  spec.metadata["source_code_uri"] = "https://github.com/svix/agentic-commerce-protocol"
  spec.metadata["documentation_uri"] = "https://developers.openai.com/commerce/guides/get-started"

  spec.files = Dir["lib/**/*.rb", "README.md", "LICENSE"]
  spec.require_paths = ["lib"]
end

