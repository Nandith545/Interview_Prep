def sum_numbers_recursive(numbers):
  if len(numbers) == 0:
    return 0
  return numbers[0] + sum_numbers_recursive(numbers[1:])

# n is Array length, n sub arrays are created using array slicing
#Time Complexity: O(n^2)
#Space Complexity: O(n^2)
#Reason: We are using a recursive function to sum the numbers.
