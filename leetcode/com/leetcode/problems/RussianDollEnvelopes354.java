package com.leetcode.problems;

import java.util.Arrays;
import java.util.Comparator;

class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])
                {
                    return o2[1] - o1[1];
                }else
                {
                    return o1[0]-o2[0];
                }
            }
        });
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = envelopes[i][1];
        }
        int a = lengthOfLIS(height);
        return a;
    }

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


public class RussianDollEnvelopes354 {
    public static void main(String[] args) {

        Solution354 s = new Solution354();
        int[][] arr = {{5,4},{6,4},{6,7},{2,3}};
        int i = s.maxEnvelopes(arr);
        System.out.println(i);
    }
}
