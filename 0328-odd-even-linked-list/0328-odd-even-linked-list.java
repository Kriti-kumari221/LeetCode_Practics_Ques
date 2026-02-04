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
    public ListNode oddEvenList(ListNode head) {
        ListNode res1=new ListNode(0);
        ListNode res2=new ListNode(0);
        ListNode even=res1;
        ListNode odd=res2;
        int count=0;
        while(head!=null){
            if(count%2==0){
                odd.next=head;
                odd=odd.next;
            }
            else{
                even.next=head;
                even=even.next;
            }
            count++;
            head=head.next;
        }
        odd.next=res1.next;
        even.next=null;
        return res2.next;
    }
}