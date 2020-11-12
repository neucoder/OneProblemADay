


class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pm = head;
        return head;

    }

    ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}


public class ReverseLinkedListII92 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        Solution92 s = new Solution92();
        s.reverse(head);

    }
}
