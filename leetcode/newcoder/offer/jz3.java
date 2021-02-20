package newcoder.offer;

import java.util.ArrayList;

public class jz3 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> tmp = new ArrayList<>();
            ArrayList<Integer> res = new ArrayList<>();
            while (listNode != null) {
                tmp.add(listNode.val);
                listNode = listNode.next;
            }
            int n = tmp.size() - 1;
            for (int i = 0; i < tmp.size(); i++) {
                int t = tmp.get(n - i);
                res.add(t);
            }
            return res;
        }

        public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

            ArrayList<Integer> res = new ArrayList<>();
            ListNode head = null;
            while (listNode != null) {
                ListNode p = listNode;
                listNode = listNode.next;
                p.next = head;
                head = p;

            }
            while (head != null) {
                res.add(head.val);
                head = head.next;
            }
            int a = 12;
            return res;
        }
    }

    public static void main(String[] args) {
//        {67,0,24,58}
        ListNode listNode = new ListNode(67);
        listNode.next = new ListNode(0);
        Solution s = new Solution();
        s.printListFromTailToHead1(listNode);
    }
}
