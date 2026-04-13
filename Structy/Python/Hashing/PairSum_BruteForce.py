def pair_sum(numbers, target_sum):

  for i in range(0, len(numbers)):
    for j in range(i+1, len(numbers)):
      if target_sum == numbers[i] + numbers[j]:
        return (i, j)

# n is length of numbers
#Time Complexity: O(n^2)
#Space Complexity: O(1) 
#Reason: We are using a nested loop to find the pair.
#Reason: We are not using any extra space.