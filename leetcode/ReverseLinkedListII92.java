import java.util.List;

class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p1 = head;
        ListNode p2 = head;

        if(m==n)
        {
            return head;
        }


        if(m==1)
        {
            while (--n>0)
            {
                p2 = p2.next;
            }
            ListNode end = p2.next;

            p2.next = null;
            ListNode last = reverse(p1);

            p1.next = end;
            return last;
        }

        m = m-1;
        while (--m>0)
        {
            p1 = p1.next;
        }

        ListNode start = p1;
        p1 = p1.next;


        while (--n>0)
        {
            p2 = p2.next;
        }
        ListNode end = p2.next;

        p2.next = null;
        ListNode last = reverse(p1);
        start.next = last;
        p1.next = end;

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
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        Solution92 s = new Solution92();
        ListNode reverse = s.reverseBetween(head, 2,4);
        System.out.println("the end");

    }
}
