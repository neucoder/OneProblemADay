package newcoder.offer.two;

public class jz14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public ListNode FindKthToTail(ListNode head,int k) {
            int len = 0;

            ListNode p1 = head;
            ListNode p2 = head;
            while (p1!=null)
            {
                p1=p1.next;
                len++;
            }
            p1 = head;
            if(k>len){
                return null;
            }
            while (k-->0)
            {
                p2 = p2.next;
            }
            while (p2!=null)
            {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
    }
}
