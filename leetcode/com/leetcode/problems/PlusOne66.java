package com.leetcode.problems;

class Solution66 {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        for (int i = digits.length-1; i >= 1 ; i--) {
            if(digits[i]>9)
            {
                digits[i]%=10;
                digits[i-1]+=1;
            }
        }
        int[] res = new int[digits.length+1];
        if(digits[0] > 9)
        {

            for (int i = 1; i < digits.length; i++) {
                res[i+1] = digits[i];
            }
            res[1] = digits[0]%10;
            res[0] = 1;
            return res;
        }

        return digits;
    }
}

public class PlusOne66 {
    public static void main(String[] args) {
        Solution66 s  = new Solution66();
        int[] ints = s.plusOne(new int[]{9,9,9});
    }

}
