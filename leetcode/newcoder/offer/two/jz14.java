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
        public ListNode FindKthToTail(ListNode pHead,int k) {
            int len = 0;

            ListNode p1 = pHead;
            ListNode p2 = pHead;
            while (p1!=null)
            {
                p1=p1.next;
                len++;
            }
            p1 = pHead;
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
