package com.leetcode.problems;


import java.util.Arrays;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}



public class Problem977 {
    public static void main(String[] args) {
        Solution977 s = new Solution977();
        int[] ints = s.sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(ints));

        System.out.println("test");
    }
}
