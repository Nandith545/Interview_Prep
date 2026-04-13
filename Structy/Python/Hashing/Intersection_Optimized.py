from typing import Any

def intersection(a, b):
  set_a = set[Any](a)
  return [item for item in b if item in set_a]