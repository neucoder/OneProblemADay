package com.leetcode.problems;


import java.util.HashMap;
import java.util.Map;

class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2)
        {
            return false;
        }
        int left = 0, right = 0;
        int valid = 0;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < len1; i++) {
            Character c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0)+1);
        }
        while (right < len2)
        {
            Character c = s2.charAt(right);
            right++;
            if(need.containsKey(c))
            {
                window.put(c, 1+window.getOrDefault(c, 0));
                if(window.get(c).equals(need.get(c)))
                {
                    valid++;
                }
            }

            while (right-left>=len1)
            {
                if(valid==need.size())
                {
                    return true;
                }
                Character d = s2.charAt(left);
                left++;
                if(need.containsKey(d))
                {
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d, -1+window.get(d));
                }

            }

        }


        return false;
    }
}



public class Problem567 {
    public static void main(String[] args) {
        Solution567 s = new Solution567();
        boolean b = s.checkInclusion("ab", "eidbaooo");
        System.out.println(b);
        b = s.checkInclusion("ab","eidboaoo");
        System.out.println(b);
        System.out.println("hello, world");
    }
}
