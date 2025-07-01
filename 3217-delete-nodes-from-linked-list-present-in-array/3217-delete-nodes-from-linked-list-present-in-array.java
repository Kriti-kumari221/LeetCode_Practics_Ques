import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Add all nums into a HashSet for O(1) lookup
        HashSet<Integer> deleteSet = new HashSet<>();
        for (int num : nums) {
            deleteSet.add(num);
        }

        // Step 2: Use a dummy node to handle head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (deleteSet.contains(curr.val)) {
                prev.next = curr.next;  // delete current node
            } else {
                prev = curr;  // move prev only if current is not deleted
            }
            curr = curr.next;  // always move curr
        }

        return dummy.next;
    }
}
