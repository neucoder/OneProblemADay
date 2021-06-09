package com.leetcode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class brack {

    private boolean solution(String str){
        Stack<Character>  stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(' || c=='{'||c=='['){
                stack.push(c);
            }
            else {
                if(!stack.isEmpty() && stack.get(stack.size()-1).equals(map.get(c)))
                {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.get(0));
        System.out.println(s.get(s.size()-1));
        System.out.println(s.lastElement());
        brack s1 = new brack();
        boolean b = s1.solution("(");
        System.out.println(b);
        boolean b1 = s1.solution("{[]}");
        System.out.println(b1);
    }
}
