def pair_product(numbers, target_product):
  has_seen = {}

  for index, num in enumerate(numbers):
    complement = target_product / num
    if complement in has_seen:
      return (index, has_seen[complement])
    has_seen[num] = index

# n is length of numbers    
#Time Complexity: O(n)
#Space Complexity: O(n) 
#Reason: We are using a dictionary to store the numbers we have seen.
#Reason: We are iterating through the numbers to find the pair.
