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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length=1;
        ListNode fast=head;
        while(fast.next!=null){
            fast=fast.next;
            length++;
        }
        fast.next=head;
        k=k%length;
        int step=length-k;
        ListNode tail=fast;
        while(step-->0){
            tail=tail.next;
        }
        ListNode newHead=tail.next;
        tail.next=null;
        return newHead;


        
    }
}