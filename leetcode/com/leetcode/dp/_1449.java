package com.leetcode.dp;


import java.util.HashMap;

public class _1449 {
    String res = "0";

    public String largestNumber(int[] cost, int target) {
        res="0";
        HashMap<String, String> memo = new HashMap<>();
        dfs(cost, target, new StringBuilder(), memo);
        return res;
    }
    private String dfs(int[] cost, int target, StringBuilder sb, HashMap<String, String> memo){
        if(target==0){
            return sb.toString();
        }
        if(target<0){
            return "";
        }
        String key = target+","+sb.toString();
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        String res = "";
        for(int i=0;i<9;i++){
            sb.append(i+1);
            String t = dfs(cost, target-cost[i], sb, memo);
            if(res.length() < t.length() || res.compareTo(t) < 0){
                res = t;
            }
            sb.deleteCharAt(sb.length()-1);
        }
        memo.put(key, res);
        return res;
    }

    public static void main(String[] args) {
        int[] cost = {4,3,2,5,6,7,2,5,5};
        int[] cost1 = {7,6,5,5,5,6,8,7,8};
        int[] cost2 = {2,4,6,2,4,6,4,4,4};
        int[] cost3 = {6,10,15,40,40,40,40,40,40};
        int[] cost4 = {1,1,1,1,1,1,1,3,2};

        _1449 s = new _1449();
        String s1 = s.largestNumber(cost, 6);
        System.out.println(s1);
        String s2 = s.largestNumber(cost1, 12);
        System.out.println(s2);
        System.out.println(s.largestNumber(cost2, 5));
        System.out.println(s.largestNumber(cost3, 47));
        System.out.println(s.largestNumber(cost4, 10));
        System.out.println("hello");
    }
}
