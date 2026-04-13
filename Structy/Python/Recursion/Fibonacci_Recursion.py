def fibonacci(n):
  if n < 2:
    return n
  return fibonacci(n - 1) + fibonacci(n - 2)

# n is the number of times the function is called
#Time Complexity: O(2^n)
#Space Complexity: O(n)
#Reason: We are using a recursive function to calculate the Fibonacci sequence.