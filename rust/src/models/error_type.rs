// this file is @generated
use std::fmt;

use serde::{Deserialize, Serialize};

#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ErrorType {
    #[serde(rename = "invalid_request")]
    InvalidRequest,
    #[serde(rename = "request_not_idempotent")]
    RequestNotIdempotent,
    #[serde(rename = "processing_error")]
    ProcessingError,
    #[serde(rename = "service_unavailable")]
    ServiceUnavailable,
}

impl fmt::Display for ErrorType {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        let value = match self {
            Self::InvalidRequest => "invalid_request",
            Self::RequestNotIdempotent => "request_not_idempotent",
            Self::ProcessingError => "processing_error",
            Self::ServiceUnavailable => "service_unavailable",
        };
        f.write_str(value)
    }
}
