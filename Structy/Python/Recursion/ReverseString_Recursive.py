def reverse_string(s):
  if len(s) == 0:
    return ""
  return reverse_string(s[1:]) + s[0]

# n is the length of the string
#Time Complexity: O(n^2)
#Space Complexity: O(n^2)
#Reason: We are using a recursive function to reverse the string.