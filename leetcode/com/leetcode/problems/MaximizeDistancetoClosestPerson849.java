package com.leetcode.problems;

import java.util.Arrays;

class Solution849 {
    public int maxDistToClosest(int[] seats) {
        int[] left = new int[seats.length];
        int[] right = new int[seats.length];

        Arrays.fill(left, seats.length);
        Arrays.fill(right, seats.length);

        for (int i = 0; i < seats.length; i++) {
            if(seats[i]==1)
            {
                left[i] = 0;
            }else if(i>0)
            {
                left[i] = left[i-1] + 1;
            }

        }

        for (int i = seats.length-1; i >=0 ; i--) {
            if(seats[i]==1)
            {
                right[i] = 0;
            }else if(i<seats.length-1)
            {
                right[i] = right[i+1]+1;
            }

        }

        int m = 0;
        for (int i = 0; i < left.length; i++) {
            if(seats[i]==0)
                m = Math.max(m, Math.min(left[i], right[i]));
        }

        return m;
    }
}

public class MaximizeDistancetoClosestPerson849 {
    public static void main(String[] args) {

        Solution849 s = new Solution849();
        int i = s.maxDistToClosest(new int[]{1,0,0,0});
        System.out.println(i);
    }
}
