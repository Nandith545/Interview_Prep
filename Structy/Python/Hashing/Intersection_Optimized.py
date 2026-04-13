from typing import Any

def intersection(a, b):
  set_a = set[Any](a)
  return [item for item in b if item in set_a]

# n is length of a and m is length of b
#Time Complexity: O(n + m)
#Space Complexity: O(n)
#Reason: We are using a set to store the elements of a.
#Reason: We are iterating through the elements of b to find the intersection.