package com.leetcode.problems;

class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int p:position)
        {
            if(p%2==0)
            {
                even += 1;
            }
        }
        return Math.min(even, position.length - even);
    }
}


public class MinimumCosttoMoveChiptoTheSamePosition1217 {
    public static void main(String[] args) {
        Solution1217 s = new Solution1217();
        int i = s.minCostToMoveChips(new int[]{1, 2, 3});
        System.out.println(i);
        i = s.minCostToMoveChips(new int[]{2,2,2,3,3});
        System.out.println(i);
        i = s.minCostToMoveChips(new int[]{1,1000000000});
        System.out.println(i);
    }
}
