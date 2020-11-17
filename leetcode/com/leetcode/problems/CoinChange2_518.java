package com.leetcode.problems;

class Solution518 {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for (int i = 0; i < coins.length + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for(int j=1;j<=amount;j++)
            {
                if(j-coins[i-1]>=0)
                {
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                }else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        return dp[coins.length][amount];
    }
}

public class CoinChange2_518 {
    public static void main(String[] args) {
        Solution518 solution518 = new Solution518();
        int change = solution518.change(10, new int[]{10});
        System.out.println(change);
    }
}
