package com.leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class coinCharge {

    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> memo = new HashMap<>();
        return dp(coins, amount, memo);
    }

    private int dp(int[] coins, int n, Map<Integer, Integer> memo) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subMoney = n - coins[i];
            int subproblem;
            if (memo.containsKey(subMoney)) {
                subproblem = memo.get(subMoney);
            } else {
                subproblem = dp(coins, subMoney, memo);
                memo.put(subMoney, subproblem);
            }

            if (subproblem == -1) {
                continue;
            }
            res = Math.min(res, 1 + subproblem);

        }
        return res != Integer.MAX_VALUE ? res : -1;
    }


    private int dp(int[] coins, int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subproblem = dp(coins, n - coins[i]);
            if (subproblem == -1) {
                continue;
            }
            res = Math.min(res, 1 + subproblem);
        }
        return res != Integer.MAX_VALUE ? res : -1;
    }

    private int dp1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i < coins[j]) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }

    public static void main(String[] args) {
        coinCharge coin = new coinCharge();
        int[] coins = new int[]{1, 2, 5};
        int i = coin.coinChange(coins, 100);
        System.out.println(i);
        long l = System.currentTimeMillis();
        int dp = coin.dp(coins, 40);

        System.out.println(dp);
        System.out.println("运行时间:" + 1.0 / 1000 * (System.currentTimeMillis() - l));
        System.out.println("abc");
    }
}
