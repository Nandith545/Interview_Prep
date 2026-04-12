from typing import Any
from collections import Counter

def most_frequent_char(s):
  count = Counter[Any](s)
  best = None
  for char in count:
    if best is None or count[char] > count[best]:
      best = char
  return best
    
# n is length of s
#Time Complexity: O(n)
#Space Complexity: O(n) 
#Reason: We are using a dictionary to store the character counts.
#Reason: We are iterating through the string to count the characters.
