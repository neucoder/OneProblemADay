package com.leetcode.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToArr {
    public static int[][] stringToArr(String s){
        String pattern = "\\d,\\d";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(s);
        ArrayList<int[]> arr = new ArrayList<>();
        while (matcher.find()){
            String group = matcher.group(0);
            String[] split = group.split(",");
            int[] arr2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                arr2[i] = Integer.parseInt(split[i]);
            }
            arr.add(arr2);
        }
        int[][] res = new int[arr.size()][arr.get(0).length];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "[[5,4],[6,4],[6,7],[2,3]]";
        String pattern = "\\d,\\d";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
