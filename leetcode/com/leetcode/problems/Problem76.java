package com.leetcode.problems;

/*
76. Minimum Window Substring

Given two strings s and t, return the minimum window in s which will contain all the characters in t. If there is no such window in s that covers all characters in t, return the empty string "".

Note that If there is such a window, it is guaranteed that there will always be only one unique minimum window in s.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Example 2:

Input: s = "a", t = "a"
Output: "a"
*
* */

import com.leetcode.utils.ReadFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Solution76 {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0, start = 0, len = Integer.MAX_VALUE,valid = 0;
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), 1+need.getOrDefault(t.charAt(i),0));
        }

        while (right<s.length())
        {
            char c = s.charAt(right);

            right++;
            if(need.containsKey(c)){
                window.put(c, 1 + window.getOrDefault(c, 0));

                if(window.get(c).equals(need.get(c)))
                {
                    valid++;
                }
            }

            while (valid==need.size()){
                if(right-left<len){
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(need.get(d).equals(window.get(d))){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }

            }

        }

        System.out.println(start);
        System.out.println(len);
        return len==Integer.MAX_VALUE?"":s.substring(start, start+len);
    }
}

public class Problem76 {
    public static void main(String[] args) throws IOException {

        Solution76 s = new Solution76();
        String s2 = ReadFile.readFile("s.txt");
        String s3 = ReadFile.readFile("t.txt");
        String s1 = s.minWindow(s2, s3);
        System.out.println(s1);
        Integer a=12121212;
        Integer b= 12121212;
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
