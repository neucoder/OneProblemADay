package com.leetcode.problems;


import java.util.HashMap;
import java.util.Map;

class Solution1252 {
    public int oddCells(int n, int m, int[][] indices) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            row.put(indices[i][1], row.getOrDefault(indices[i][1],0)+1);
            col.put(indices[i][0], col.getOrDefault(indices[i][0],0)+1);
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int t = row.getOrDefault(i, 0)+col.getOrDefault(j, 0);
                if(t%2==1)
                {
                    res+=1;
                }
            }
        }

        return res;
    }
}


public class Problem1252 {
    public static void main(String[] args) {
        Solution1252 s = new Solution1252();
        int[][] nums = {{0,0},{1,1}};
        int i = s.oddCells(2, 2, nums);
        System.out.println(i);
        System.out.println("test");
    }
}
