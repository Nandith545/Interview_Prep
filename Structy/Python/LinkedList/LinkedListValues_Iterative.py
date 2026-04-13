# class Node:
#   def __init__(self, val):
#     self.val = val
#     self.next = None

def linked_list_values(head):
  list = []
  current = head
  while current is not None:
    list.append(current.val)
    current = current.next
  return list
