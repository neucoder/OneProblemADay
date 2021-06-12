package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class _494Target_sum {

    private int result = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrace(nums, target, 0, 0);
        return result;
    }

//    回溯
    private void backtrace(int[] nums, int target,int index, int sum){
        if(index==nums.length){
            if(sum==target){
                result+=1;
            }
            return;
        }

        backtrace(nums, target, index+1, sum+nums[index]);
        backtrace(nums, target, index+1, sum-nums[index]);
    }

//    回溯加备忘录
    private int backtrace(int[] nums, int target, int index, int sum, Map<String, Integer> memo){
        if(index==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        String key = index+","+sum;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int ret1 = backtrace(nums, target, index+1, sum+nums[index], memo);
        memo.put((index+1)+","+(sum+nums[index]), ret1);
        int ret2 = backtrace(nums, target, index+1, sum-nums[index], memo);
        memo.put((index+1)+","+(sum-nums[index]), ret2);
        return ret1+ret2;
    }

//    动态规划
    private int dp(int[] nums, int target){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum<target||(sum+target)%2==1){
            return 0;
        }
        target = (sum+target)/2;
        int[][] dp = new int[nums.length+1][target+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < target+1; j++) {
                if(j>=nums[i-1]){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][target];
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1};
        _494Target_sum s = new _494Target_sum();
        int ret = s.findTargetSumWays(nums, 3);
        System.out.println(ret);
        int res = s.backtrace(nums, 3, 0, 0, new HashMap<>());
        System.out.println(res);
        int dp = s.dp(nums, 3);
        System.out.println("dp:"+dp);
        System.out.println("test");
    }
}
