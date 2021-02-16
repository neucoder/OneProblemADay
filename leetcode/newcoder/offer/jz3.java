package newcoder.offer;

import java.util.ArrayList;

public class jz3 {

      public class ListNode {
          int val;
          ListNode next = null;

          ListNode(int val) {
              this.val = val;
          }
      }


    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> tmp = new ArrayList<>();
            ArrayList<Integer> res = new ArrayList<>();
            while (listNode!=null)
            {
                tmp.add(listNode.val);
                listNode = listNode.next;
            }
            int n = tmp.size()-1;
            for (int i = 0; i < tmp.size(); i++) {
                int t = tmp.get(n-i);
                res.add(t);
            }
            return res;
        }
    }
}
