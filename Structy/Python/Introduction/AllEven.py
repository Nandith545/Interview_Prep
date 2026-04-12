def all_even(nums):
  for num in nums:
    if num%2 == 1:
      return False
  return True

  #Time Complexity: O(n)
  #Reason: We are iterating through the list to check if all the numbers are even.
  #Space Complexity: O(1)
  #Reason: We are not using any extra space.