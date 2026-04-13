# class Node:
#   def __init__(self, val):
#     self.val = val
#     self.next = None

def linked_list_values(head):
  values = []
  _linked_list_values(head, values)
  return values

def _linked_list_values(head, values):
  # Base case
  if head is None:
    return
  #Recursive case
  values.append(head.val)
  _linked_list_values(head.next, values)

# n is the number of nodes in the linked list
#Time Complexity: O(n)
#Space Complexity: O(n)
#Reason: We are using a list to store the values of the nodes.

  
    
