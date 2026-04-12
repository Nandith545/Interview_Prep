def anagrams(s1, s2):
  return char_count(s1) == char_count(s2)

def char_count(s):
  count = {}
  for char in s:
    if char not in count:
      count[char] = 0
    count[char] += 1
    
  return count

# n is length of s1 and m is length of s2
#Time Complexity: O(n + m)
#Space Complexity: O(n + m) 
#Reason: We are using a dictionary to store the character counts.
#Reason: We are iterating through the strings to count the characters.  