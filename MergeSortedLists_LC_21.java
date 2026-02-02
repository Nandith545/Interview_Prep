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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Create a dummy Node to start
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        //Create a copy of this node to iterate while solving the problem
        ListNode headNode = returnNode;

        //Traverse till one of the list reaches the end
        while(list1 != null && list2 != null){
            //compare the 2 values of list
            if(list1.val <= list2.val){
                returnNode.next = list1;
                list1 = list1.next;
            }else{
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        //Append the remaining list at the end
        if(list1 == null){
            returnNode.next = list2;
        }else if(list2 == null){
            returnNode.next = list1;
        }

        //Return the next node of the dummy node
        return headNode.next;
        
    }
}
