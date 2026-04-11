def max_value(nums):
  maximum = -float('inf')
  for num in nums:
    if num > maximum:
      maximum = num
  return maximum

  #Time Complexity: O(n)
  #Space Complexity: O(1)
  #Reason: We are only using a single variable to store the maximum value.