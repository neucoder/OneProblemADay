package com.leetcode.problems;

class Solution55 {
    public boolean canJump(int[] nums) {
        int fareast = 0;
        for (int i = 0; i < nums.length-1; i++) {
            fareast = Math.max(fareast, i+nums[i]);
            if(fareast<=i)
            {
                return false;
            }
        }
        return fareast >= nums.length-1;
    }
}



public class JumpGame55 {
    public static void main(String[] args) {
        Solution55 s = new Solution55();
        boolean b = s.canJump(new int[]{2, 3, 1, 1, 4});
    }
}
