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
    public ListNode partition(ListNode head, int x) {
        ListNode beforHead=new ListNode(0);
        ListNode afterHead=new ListNode(0);
        ListNode beforeNode=beforHead;
        ListNode afternode=afterHead;
        while(head!=null){
            if(head.val<x){
                beforeNode.next=head;
                beforeNode=beforeNode.next;
            }
            else{
                afternode.next=head;
                afternode=afternode.next;

            }
            head=head.next;
        }
        afternode.next=null;
        beforeNode.next=afterHead.next;
        return beforHead.next;
    }
}