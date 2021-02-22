package newcoder.offer;

public class jz15 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static class Solution {
        public ListNode ReverseList(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode p1 = null;
            ListNode p2 = null;
            while (head!=null){
                p2 = head;
                head = head.next;
                p2.next = p1;
                p1 = p2;
            }
            return p1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        ListNode listNode = solution.ReverseList(p1);
        System.out.println("hello, world");
    }
}
