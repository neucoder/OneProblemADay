package newcoder.offer;

import java.util.Stack;

public class jz21 {

    public static class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> s = new Stack<>();
            int index = 0;
            boolean res = false;
            for (int i = 0; i < pushA.length; i++) {
                s.push(pushA[i]);
                if(pushA[i]==popA[index]){
                    while (!s.empty()){
                        if(s.get(s.size()-1)==popA[index]){
                            s.pop();
                            index++;
                        }else {
                            break;
                        }
                    }
                }

            }
            if(index==popA.length){
                return true;
            }else {
                return false;
            }
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            int [] A = {1,2,3,4,5};
            int [] B = {4,5,3,2,1};
            boolean b = s.IsPopOrder(A, B);
            System.out.println(b);
        }
    }
}
