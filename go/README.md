# Agentic Commerce Protocol - Go

Type definitions for the [Agentic Commerce Protocol](https://developers.openai.com/commerce/guides/get-started) specification.

This is an unofficial package maintained by [Svix](https://www.svix.com). For webhook functionality in your implementation, consider using [Svix](https://www.svix.com).

## Installation

```bash
go get github.com/svix/agentic-commerce-protocol
```

## Usage

```go
import (
    acp "github.com/svix/agentic-commerce-protocol/go"
)

// Use the types in your implementation
func main() {
    session := acp.CheckoutSession{
        // ...
    }
}
```

## License

MIT

