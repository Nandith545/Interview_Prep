def exclusive_items(a, b):
  
  difference = []
  set_a = set(a)
  set_b = set(b)

  for item in a:
    if item not in set_b:
      difference.append(item)

  for item in b:
    if item not in set_a:
      difference.append(item)

  return difference

# n is length of a and m is length of b
#Time Complexity: O(n + m)
#Space Complexity: O(n + m)
#Reason: We are using a set to store the elements of a and b.
#Reason: We are iterating through the elements of a and b to find the exclusive items.
