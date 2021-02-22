package newcoder.offer;

public class jz16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public ListNode Merge(ListNode list1,ListNode list2) {
//            判断两个链表都不为空
            if(list1==null){
                return list1;
            }
            if(list2==null){
                return list1;
            }
            if(list1==null&&list2==null){
                return null;
            }
            ListNode head = new ListNode(0);
            ListNode p = head;
            while (list1!=null&&list2!=null){
                if(list1.val<list2.val){
                    ListNode t = new ListNode(list1.val);
                    p.next = t;
                    p = p.next;
                    list1 = list1.next;
                }else{
                    ListNode t = new ListNode(list2.val);
                    p.next = t;
                    p = p.next;
                    list2 = list2.next;
                }
            }

            if(list1!=null){
                p.next = list1;
            }
            if(list2!=null){
                p.next = list2;
            }


            return head.next;
        }
    }
}
