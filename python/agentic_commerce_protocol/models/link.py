# this file is @generated

from .common import BaseModel
from .link_type import LinkType


class Link(BaseModel):
    type: LinkType
    url: str
