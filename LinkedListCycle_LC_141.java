/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Start a slow and fast pointer
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(slowPtr != null && fastPtr != null && fastPtr.next != null){
            //Advance both the pointers
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            //Ifvthey meet it means we found a loop
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}
