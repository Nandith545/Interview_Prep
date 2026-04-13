def sum_of_lengths(strings):
  if len(strings) == 0:
    return 0
  return len(strings[0]) + sum_of_lengths(strings[1:])

# n is the number of times the function is called
#Time Complexity: O(n^2)
#Space Complexity: O(n^2)
#Reason: We are using a recursive function to calculate the sum of lengths.
