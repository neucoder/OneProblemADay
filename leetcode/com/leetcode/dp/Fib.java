package com.leetcode.dp;

import java.util.HashMap;
public class Fib {

//    常规的递归，非常耗时
    private int fib1(int N){
        if (N<=2){
            return 1;
        }
        else{
            return fib1(N-1) + fib1(N-2);
        }
    }
    private int fib2(int N){
        if(N < 1){
            return 0;
        }
        HashMap<Integer, Integer> memo = new HashMap<>();
        return helper(memo, N);
    }

    private int helper(HashMap<Integer, Integer> memo, int N){
        if(N<=2){
            return 1;
        }
        if(memo.containsKey(N)){
            return memo.get(N);
        }else {

            int res = helper(memo, N - 1) + helper(memo, N - 2);
            memo.put(N, res);
            return res;
        }

    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        int i = fib.fib1(10);
        int i2 = fib.fib2(45);
        System.out.println(i2);
        System.out.println(i);
        int i1 = fib.fib1(45);
        System.out.println(i1);
        int res = 0x7fffffff;
        System.out.println(res);
    }
}
