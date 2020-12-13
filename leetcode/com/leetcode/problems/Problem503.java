package com.leetcode.problems;


import java.util.Arrays;
import java.util.Stack;

class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums.length];
        for (int i = 2*nums.length-1; i > 0; i--) {
            while (!s.empty()&&s.peek()<=nums[i%nums.length])
            {
                s.pop();
            }

            res[i%nums.length] = s.empty() ? -1 : s.peek();
            s.push(nums[i%nums.length]);


        }
        return res;
    }
}

public class Problem503 {
    public static void main(String[] args) {


        Solution503 s = new Solution503();
        int [] nums = {2,1,2,4,3};
        int[] ints = s.nextGreaterElements(nums);
        System.out.println(Arrays.toString(ints));

        System.out.println("hello, world");
    }
}
