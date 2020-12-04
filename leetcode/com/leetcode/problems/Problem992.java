package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

class Solution992 {
    public int subarraysWithKDistinct(int[] A, int K) {
        int n = A.length;
        int count = 0;
        int l = 0, l1 = 0, r = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i <= n; i++) {

        }
        return count;
    }
}

public class Problem992 {
    public static void main(String[] args) {
        int[] A = {1,2,1,3,4};
        Solution992 s = new Solution992();
        int i = s.subarraysWithKDistinct(A, 3);
        System.out.println(i);
        System.out.println("hello, world");
    }
}
