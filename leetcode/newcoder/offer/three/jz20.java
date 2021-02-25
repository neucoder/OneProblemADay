package newcoder.offer.three;

import java.util.Stack;

public class jz20 {
    public class Solution {
        private Stack<Integer> s = new Stack<>();
        private Stack<Integer> sMin = new Stack<>();

        public void push(int node) {
            if(s.empty()){
                s.push(node);
                sMin.push(node);
            }else {
                int t = s.get(s.size()-1);
                if(node<=t){
                    sMin.push(node);
                }
                s.push(node);
            }

        }

        public void pop() {
            if(s.empty()){
                return;
            }
            Integer pop = s.pop();
            Integer integer = sMin.get(sMin.size()-1);
            if(pop==integer){
                sMin.pop();
            }

        }

        public int top() {
            if(s.empty()){
                return -1;
            }
            Integer integer = s.get(s.size()-1);
            return integer;
        }

        public int min() {
            if(s.empty()){
                return -1;
            }
            Integer integer = sMin.get(sMin.size()-1);
            return integer;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);

        System.out.println(s.get(s.size()-1));

    }
}
