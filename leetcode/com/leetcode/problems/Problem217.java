package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0)
        {
            return false;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i]))
            {
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],0);
            }
        }
        for(Integer key:m.keySet())
        {
            if(m.get(key)>0)
            {
                return true;
            }
        }

        return false;
    }
}

public class Problem217 {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
