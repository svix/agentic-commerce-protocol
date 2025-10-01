# this file is @generated
from enum import Enum


class CheckPerformedType(str, Enum):
    AVS = "avs"
    CVV = "cvv"
    ANI = "ani"
    AUTH0 = "auth0"

    def __str__(self) -> str:
        return str(self.value)
