from typing import Any
from collections import Counter

def most_frequent_char(s):
  count = Counter[Any](s)
  best = None
  for char in count:
    if best is None or count[char] > count[best]:
      best = char
  return best
    
  