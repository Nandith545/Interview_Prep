def exclusive_items(a, b):
  result = []
  for item in b:
    if item not in a:
      result.append(item)

  for item in a:
    if item not in b:
      result.append(item)
  return result

# n is length of a and m is length of b
#Time Complexity: O(n * m)
#Space Complexity: O(min(n, m))
#Reason: We are using a nested loop to find the exclusive items.