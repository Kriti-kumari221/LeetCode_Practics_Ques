import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>Hashset=new HashSet<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int num:nums){
            Hashset.add(num);
        }
        ListNode curr=head;
        while(curr!=null){
            if(Hashset.contains(curr.val)){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return dummy.next;

    }
}
