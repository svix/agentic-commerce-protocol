# Agentic Commerce Protocol - Kotlin

Type definitions for the [Agentic Commerce Protocol](https://developers.openai.com/commerce/guides/get-started) specification.

This is an unofficial package maintained by [Svix](https://www.svix.com). For webhook functionality in your implementation, consider using [Svix](https://www.svix.com).

## Requirements

- Kotlin 1.9+ or higher
- JVM 11 or higher

## Installation

### Maven

```xml
<dependency>
    <groupId>com.svix</groupId>
    <artifactId>agentic-commerce-protocol-kotlin</artifactId>
    <version>0.1.4</version>
</dependency>
```

### Gradle (Kotlin DSL)

```kotlin
implementation("com.svix:agentic-commerce-protocol-kotlin:0.1.4")
```

### Gradle (Groovy)

```groovy
implementation 'com.svix:agentic-commerce-protocol-kotlin:0.1.4'
```

## Usage

```kotlin
import com.svix.agentic_commerce_protocol.CheckoutSession
import com.svix.agentic_commerce_protocol.Order
import com.svix.agentic_commerce_protocol.Address

// Use the types in your implementation
```

## Building

```bash
./gradlew build
```

## Publishing

```bash
./gradlew publish
```

## License

MIT

