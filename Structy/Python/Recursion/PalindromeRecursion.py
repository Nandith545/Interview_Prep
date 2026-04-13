def palindrome(s):
  if len(s) == 0 or len(s) == 1:
   return True
  if s[0] != s[-1]:
    return False

  return palindrome(s[1:-1])

# n is the length of the string
#Time Complexity: O(n^2)
#Space Complexity: O(n^2)
#Reason: We are using a recursive function to check if the string is a palindrome.