package com.leetcode.dp;

import com.leetcode.utils.StringToArr;

import java.util.Arrays;
import java.util.Comparator;

public class _300maxLIS {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >=0 ; j--) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]>o2[0] || (o1[0]==o2[0] && o1[1]>o2[1])){
                    return 1;
                }else if(o1[0]==o2[0] && o1[1]==o2[1]){
                    return 0;
                }else {
                    return -1;
                }

            }
        });
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "[[5,4],[6,4],[6,7],[2,3]]";
        int[][] arr = StringToArr.stringToArr(s);

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]>o2[0] || (o1[0]==o2[0] && o1[1]>o2[1])){
//                    return 1;
//                }else if(o1[0]==o2[0] && o1[1]==o2[1]){
//                    return 0;
//                }else {
//                    return -1;
//                }
//
//            }
//        });
//        for (int[] ints : arr) {
//            System.out.println(Arrays.toString(ints));
//        }
        _300maxLIS maxLIS = new _300maxLIS();
        int[] nums = {0,1,0,3,2,3};
        int i = maxLIS.maxEnvelopes(arr);
        System.out.println(i);

        System.out.println("hello, world");
    }

}
