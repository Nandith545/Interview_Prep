def factorial(n):
  if n < 1:
    return 1
  return n * factorial(n - 1)


# n is the number of times the function is called
#Time Complexity: O(n)
#Space Complexity: O(n)
#Reason: We are using a recursive function to calculate the factorial.