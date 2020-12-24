package com.leetcode.utils;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Integer i = 12;
        Integer j = 12;
        Integer a = 12345678;
        Integer b = 12345678;
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m1 = new HashMap<>();
        Character z = 'z';
        m.put(z,a);
        m1.put(z,b);
        System.out.println(m.get(z).equals(m.get(z)));

    }
}
