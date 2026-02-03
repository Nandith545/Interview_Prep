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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //Create a sentinel/ dummy node to store the result
        ListNode result = new ListNode(0);
        ListNode ptr = result;

        //set default carry
        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = 0 + carry; //Initialize sum

            if(l1 != null){   // use number from first list
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){  //Use number from second list
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; //get the sum and carry
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if (carry == 1) ptr.next = new ListNode(1);
    
        return result.next;
    }
}
