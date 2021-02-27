package newcoder.offer.three;

import java.util.HashMap;

public class jz25 {

public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

    public class Solution {
        public RandomListNode Clone(RandomListNode pHead)
        {
            HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
            RandomListNode p = pHead;
            while (p!=null){
                map.put(p, new RandomListNode(p.label));
                p = p.next;
            }
            RandomListNode head = map.get(pHead);
            p = pHead;
            while (p!=null){
                map.get(p).next = map.get(p.next);
                map.get(p).random = map.get(p.random);
                p = p.next;
            }
            return head;

        }
    }
}
