public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        curr = curr.next;
        System.out.println(head.val);
        return curr;
    }
}