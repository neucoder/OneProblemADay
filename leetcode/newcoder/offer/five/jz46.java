package newcoder.offer.five;

import java.util.LinkedList;

public class jz46 {
    public class Solution {
        public int LastRemaining_Solution(int n, int m) {
            if(n<=0){return -1;}
            LinkedList<Integer> res = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                res.add(i);
            }
            int index = 0;
            while (res.size()>1){
                index = (index+m-1)%res.size();
                res.remove(index);
            }
            return res.size()==0?-1:res.getFirst();
        }
    }

    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
