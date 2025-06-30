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
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            if(head==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode curr=head;
                while(curr!=slow){
                    curr=curr.next;
                    slow=slow.next;
                }
                return curr;
            }
        }
        return null;
    }
}