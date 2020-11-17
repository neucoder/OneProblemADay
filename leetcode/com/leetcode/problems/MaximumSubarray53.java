package com.leetcode.problems;

class Solution53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}


public class MaximumSubarray53 {


    public static void main(String[] args) {

        Solution53 solution53 = new Solution53();
        int i = solution53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(i);
        i = solution53.maxSubArray(new int[]{1});
        System.out.println(i);
        i = solution53.maxSubArray(new int[]{0});
        System.out.println(i);
        i = solution53.maxSubArray(new int[]{-1});
        System.out.println(i);
        i = solution53.maxSubArray(new int[]{-2147483647});
        System.out.println(i);
        i = solution53.maxSubArray(new int[]{1});
        System.out.println(i);
    }

}
