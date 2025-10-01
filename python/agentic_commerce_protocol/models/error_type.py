# this file is @generated
from enum import Enum


class ErrorType(str, Enum):
    INVALID_REQUEST = "invalid_request"
    REQUEST_NOT_IDEMPOTENT = "request_not_idempotent"
    PROCESSING_ERROR = "processing_error"
    SERVICE_UNAVAILABLE = "service_unavailable"

    def __str__(self) -> str:
        return str(self.value)
