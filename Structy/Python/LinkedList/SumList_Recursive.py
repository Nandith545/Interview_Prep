# class Node:
#   def __init__(self, val):
#     self.val = val
#     self.next = None

def sum_list(head):
  if head is None:
    return 0
  return head.val + sum_list(head.next)
    
  
