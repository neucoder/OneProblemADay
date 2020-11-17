package com.leetcode.problems;

import java.util.Arrays;

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j=0;j<i;j++)
            {
                if(nums[j] < nums[i])
                {
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }

        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);

        }
        return res;
    }
}


public class LongestIncreasingSubsequence300 {
    public static void main(String[] args) {
        Solution300 s = new Solution300();
        int i = s.lengthOfLIS(new int[]{3, 2, 1});
        System.out.println(i);
    }

}
