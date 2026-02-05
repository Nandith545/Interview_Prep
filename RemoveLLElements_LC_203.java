/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head !=null && head.val == val){
            head = head.next;
        }
        ListNode current_Node = head;
        while(current_Node != null && current_Node.next != null){
            if(current_Node.next.val == val){
                current_Node.next = current_Node.next.next;
            }else{
                current_Node = current_Node.next;
            }
        }
        return head;
    }
}
