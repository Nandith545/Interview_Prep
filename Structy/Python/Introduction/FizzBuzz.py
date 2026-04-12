def fizz_buzz(n):
  result = []
  for i in range(1, n + 1):
    if i % 3 == 0 and i % 5 == 0:
      result.append("fizzbuzz")
    elif i % 3 == 0:
      result.append("fizz")
    elif i % 5 == 0:
      result.append("buzz")
    else:
      result.append(i)
      
  return result

  #Time Complexity: O(n)
  #Reason: We are iterating through the range to check if the number is divisible by 3 or 5.
  #Space Complexity: O(n)
  #Reason: We are using a list to store the result.