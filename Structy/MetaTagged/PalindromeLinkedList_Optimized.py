# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        #Initialize fast and slow pointers
        fast = head
        slow = head
       
       # Find the middle of a linked list
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        # Now slow will be exactly at the middle point

        # reverse the second half of the linked list
        prev = None
        while slow:
            temp = slow.next
            slow.next = prev
            prev = slow
            slow = temp
        
        #Palindrome check
        l , r = head, prev
        while r:
            if l.val != r.val:
                return False
            l = l.next
            r = r.next
        return True
       
           
