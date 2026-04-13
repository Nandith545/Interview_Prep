def all_unique(items):
  set_items = set(items)
  return len(items) == len(set_items)

# n is length of items
#Time Complexity: O(n)
#Space Complexity: O(n)
#Reason: We are using a set to store the elements of items.
#Reason: We are iterating through the elements of items to find the unique items.