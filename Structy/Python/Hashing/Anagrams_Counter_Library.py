from typing import Any
from collections import Counter

def anagrams(s1, s2):
  return Counter[Any](s1) == Counter[Any](s2)

# n is length of s1 and m is length of s2
#Time Complexity: O(n + m)
#Space Complexity: O(n + m) 
#Reason: We are using a dictionary to store the character counts.
#Reason: We are iterating through the strings to count the characters.
#Reason: We are comparing the character counts of the two strings.