package com.leetcode.bfs;

import java.util.HashMap;
import java.util.LinkedList;

public class _297SquareNum {


    public int numSquares(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return dfs(n, memo);
    }

    private int numsquares(int n){
        int[] dp = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            dp[i] = i;
            for (int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(dp[i], 1+dp[i-j*j]);
            }
        }
        return dp[n];
    }

    private int dfs(int n, HashMap<Integer, Integer> memo){
        int ret = n;
        int k = (int)Math.sqrt(n);
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        for (int i = k; i > 0 ; i--) {
            ret = Math.min(ret, 1+dfs(n-i*i, memo));
        }
        memo.put(n, ret);
        return ret;
    }
    private int dfs(int n){
        int ret = n;
        int k = (int)Math.sqrt(n);
        for (int i = k; i > 0 ; i--) {
            ret = Math.min(ret, 1+dfs(n-i*i));
        }
        return ret;
    }

    private int bfs(int n){
        int m = (int)Math.sqrt(n);
        LinkedList<Integer> q = new LinkedList<>();
        int res = 1;
        q.add(n);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer first = q.poll();
                int limit = (int)Math.sqrt(first);
                for (int j = limit; j > 0; j--) {
                    int t = first-j*j;
                    if(t>0){
                        q.offer(t);
                    }else if(t==0){
                        return res;
                    }
                }
            }
            res += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        _297SquareNum squareNum = new _297SquareNum();

        long l = System.currentTimeMillis();
        squareNum.bfs(3);
        for (int i = 1; i < 15; i++) {
            int i1 = squareNum.numSquares(i);
            int bfs = squareNum.bfs(i);
            int i2 = squareNum.numsquares(i);
            System.out.println(i1+","+bfs+","+i2);

        }
    }
}
