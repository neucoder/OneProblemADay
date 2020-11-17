package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0)
            {
                m.put(nums[i], 1);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if(!m.containsKey(i))
            {
                return i;
            }

        }
        return nums.length+1;
    }

}


public class FirstMissingPositive41 {
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        int i = s.firstMissingPositive(new int[]{1, 2, 3});
        System.out.println(i);
        i = s.firstMissingPositive(new int[]{3,4,-1,1});
        System.out.println(i);
        i = s.firstMissingPositive(new int[]{7,8,9,11,12});
        System.out.println(i);
        i = s.firstMissingPositive(new int[]{1});
        System.out.println(i);
    }
}
