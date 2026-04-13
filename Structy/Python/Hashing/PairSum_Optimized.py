def pair_sum(numbers, target_sum):
  has_seen = {}

  for index, number in enumerate(numbers):
    complement = target_sum - number
    if complement in has_seen:
      return (index, has_seen[complement])
    has_seen[number] = index

# n is length of numbers
#Time Complexity: O(n)
#Space Complexity: O(n) 
#Reason: We are using a dictionary to store the numbers we have seen.
#Reason: We are iterating through the numbers to find the pair.