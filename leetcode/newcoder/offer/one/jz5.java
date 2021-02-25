package newcoder.offer.one;

import java.util.Stack;

public class jz5 {
    public class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if(stack2.size()==0&&stack1.size()==0){
                return 0;
            }
            if(stack2.size()==0)
            {
                while (stack1.size()!=0){
                    Integer pop = stack1.pop();
                    stack2.push(pop);
                }

                return stack2.pop();
            }else {
                return stack2.pop();
            }
        }
    }
}
