package com.leetcode.problems;

class Solution1250 {
    public boolean isGoodArray(int[] nums) {

        if(nums.length==0)
        {
            return false;
        }
        int res = nums[0];

        for(int s: nums)
        {
            res = gcd(res, s);
        }
        return res==1;
    }

    int gcd(int a, int b)
    {
        if(a<=0 || b<=0)
        {
            return 0;
        }
        int t = Math.max(a, b);
        b = Math.min(a, b);
        a = t;
        while (t > 0)
        {
            t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}


public class CheckIfItIsGoodArray1250 {
    public static void main(String[] args) {

        Solution1250 s = new Solution1250();
        System.out.println(s.gcd(3,7));
        System.out.println(s.gcd(24,16));
        System.out.println(s.isGoodArray(new int[]{12,5,7,23}));
        System.out.println(s.isGoodArray(new int[]{29,6,10}));
        System.out.println(s.isGoodArray(new int[]{3,6}));
        System.out.println(s.isGoodArray(new int[]{12}));
        System.out.println(s.isGoodArray(new int[]{}));


    }
}
