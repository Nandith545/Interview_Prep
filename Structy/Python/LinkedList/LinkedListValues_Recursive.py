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
  
  
    
