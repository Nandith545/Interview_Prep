from math import sqrt, floor

def is_prime(n):
  if n < 2:
    return False

  for i in range(2, floor(sqrt(n)) + 1):
    if n % i == 0:
      return False
  return True

  #Time Complexity: O(sqrt(n))
  #Space Complexity: O(1)
  #Reason: We are iterating through the range to check if the number is prime.
  #Reason: We are not using any extra space.
  #Reason: We are using the sqrt function to check if the number is prime.