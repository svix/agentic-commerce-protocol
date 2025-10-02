# Agentic Commerce Protocol - Java

Type definitions for the [Agentic Commerce Protocol](https://developers.openai.com/commerce/guides/get-started) specification.

This is an unofficial package maintained by [Svix](https://www.svix.com). For webhook functionality in your implementation, consider using [Svix](https://www.svix.com).

## Requirements

- Java 11 or higher

## Installation

### Maven

```xml
<dependency>
    <groupId>com.svix</groupId>
    <artifactId>agentic-commerce-protocol-java</artifactId>
    <version>0.1.7</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.svix:agentic-commerce-protocol-java:0.1.7'
```

## Usage

```java
import com.svix.agentic_commerce_protocol.CheckoutSession;
import com.svix.agentic_commerce_protocol.Order;
import com.svix.agentic_commerce_protocol.Address;

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

