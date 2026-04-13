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

# n is the number of nodes in the linked list
#Time Complexity: O(n)
#Space Complexity: O(n)
#Reason: We are using a list to store the values of the nodes.
