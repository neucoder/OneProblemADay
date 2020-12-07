package com.leetcode.problems;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            m.put(nums2[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {

            for (int j = m.get(nums1[i]); j < nums2.length; j++) {
                if(nums2[j]>nums1[i])
                {
                    res[i] = nums2[j];
                    break;
                }else if(j==nums2.length-1)
                {
                    res[i] = -1;
                }
            }

        }

        return res;
    }
}

public class Problem496 {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        Solution496 s = new Solution496();
        int[] ints = s.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ints));
        System.out.println("Hello, World");
    }
}
