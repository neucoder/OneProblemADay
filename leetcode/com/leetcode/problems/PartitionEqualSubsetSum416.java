package com.leetcode.problems;

class Solution416 {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if(sum%2==1)
        {
            return false;
        }
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 0; i <= sum; i++) {
            dp[0][i] = false;
        }
        for (int i = 1; i <= nums.length; i++) {
            for(int j=1;j<=sum;j++)
            {
                if(j-nums[i-1] < 0)
                {
                    dp[i][j] = dp[i-1][j];
                }else
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }

            }
        }

        return dp[nums.length][sum];

    }
}





public class PartitionEqualSubsetSum416 {
    public static void main(String[] args) {
        Solution416 s = new Solution416();
        boolean b = s.canPartition(new int[]{1,5,11,5});
        System.out.println(b);
        b = s.canPartition(new int[]{2});
        System.out.println(b);
    }
}
