package newcoder.offer.four;

import java.util.HashMap;

public class jz36 {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public class Solution {
        public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
            if(pHead1==null||pHead2==null){
                return null;
            }
            int len1 = 0, len2 = 0;
            ListNode p1 = pHead1, p2 = pHead2;
            while (p1!=null){
                len1++;
                p1 = p1.next;

            }
            while (p2!=null){
                len2++;
                p2 = p2.next;
            }
            p1 = pHead1;
            p2 = pHead2;
            if(len2>len1)
            {
                int k = len2-len1;
                while (k-->0){
                    p2 = p2.next;
                }
            }else {
                int k = len1-len2;
                while (k-->0){
                    p1 = p1.next;
                }
            }
            while (p1!=null){
                if(p1==p2){
                   break;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if(pHead1==null||pHead2==null){
                return null;
            }
            HashMap<ListNode, Integer> map = new HashMap<>();
            while (pHead1!=null){
                map.put(pHead1, 1);
                pHead1 = pHead1.next;
            }
            while (pHead2!=null){
                map.put(pHead1, 1);
                if(map.containsKey(pHead2)){
                    return pHead2;
                }
                pHead2 = pHead2.next;
            }
            return null;
        }
    }
}
