# this file is @generated
from enum import Enum


class ContentType(str, Enum):
    PLAIN = "plain"
    MARKDOWN = "markdown"

    def __str__(self) -> str:
        return str(self.value)
