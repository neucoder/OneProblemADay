package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A{
    String s;
    int a;
    double d;
    char c;
    boolean b;

    public A() {
    }

    public A(String s, int a, double d, char c, boolean b) {
        this.s = s;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        A a1 = (A) o;
//
//        if (a != a1.a) return false;
//        if (Double.compare(a1.d, d) != 0) return false;
//        if (c != a1.c) return false;
//        if (b != a1.b) return false;
//        return s.equals(a1.s);
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = s.hashCode();
//        result = 31 * result + a;
//        temp = Double.doubleToLongBits(d);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (int) c;
//        result = 31 * result + (b ? 1 : 0);
//        return result;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        A a1 = (A) o;
//        return a == a1.a &&
//                Double.compare(a1.d, d) == 0 &&
//                c == a1.c &&
//                b == a1.b &&
//                s.equals(a1.s);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(s, a, d, c, b);
//    }




    @Override
    public String toString() {
        return "A{" +
                "s='" + s + '\'' +
                ", a=" + a +
                ", d=" + d +
                ", c=" + c +
                ", b=" + b +
                '}';
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}


public class coinChange2 {
//    给定不同面额的硬币和一个总金额。
//    写出函数来计算可以凑成总金额的硬币组合数。
//    假设每一种面额的硬币有无限个。
//    目前不是很理解

    private int res = 0;
    static class Two{
        int amount;
        int index;

        public Two(int amount, int index) {
            this.amount = amount;
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Two two = (Two) o;
            return amount == two.amount &&
                    index == two.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount, index);
        }
    }
    public int change(int amount, int[] coins) {
        Map<Two, Integer> memo = new HashMap<>();
        return backtrace(amount, coins, 0, memo);
    }

    private void backtrace(int amount, int[] coins, int index){
        if(amount<0){
            return ;
        }
        if(amount==0){
            res+=1;
            return;
        }
        for (int i = index; i < coins.length; i++) {

            backtrace(amount-coins[i], coins, i);
        }

    }

    private int backtraceMemo(int amount, int[] coins, int index, Map<String, Integer> memo){
        if(amount<0){
            return -1;
        }
        if(amount==0){
            return 1;
        }
        int res = 0;
        String key = amount+","+index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        for (int i = index; i < coins.length; i++) {
            int t = backtraceMemo(amount-coins[i], coins, i, memo);
            if(t==-1){
                continue;
            }
            key = (amount-coins[i])+","+i;
            res+=t;
            memo.put(key, t);

        }
        return res;
    }

    private int backtrace(int amount, int[] coins, int index, Map<Two, Integer> memo){
        if(amount<0){
            return -1;
        }
        int res = 0;
        if(amount==0){
            return 1;
        }
        Two key = new Two(amount, index);
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        for (int i = index; i < coins.length; i++) {

            int backtraces = backtrace(amount - coins[i], coins, i, memo);
            if(backtraces==-1){
                continue;
            }else {
                Two two = new Two(amount - coins[i], i);
                res+=backtraces;
                memo.put(two, backtraces);
            }
        }
        return res;
    }

    private void testPara(int ...arr){
        for(int a:arr){
            System.out.println(a);
        }
    }
    private int dp(int amount, int[] coins){
        int[][] dp  = new int[coins.length+1][amount+1];
        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < coins.length+1; i++) {
            for (int j = 0; j < amount+1; j++) {
                if(j>=coins[i-1]){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {



        coinChange2 cc2 = new coinChange2();
        int[] coins = {3,5,7,8,9,10,11};

        int res = cc2.backtraceMemo(500, coins, 0, new HashMap<>());
        System.out.println(res);
        res = cc2.change(500, coins);
        System.out.println(res);
        System.out.println(cc2.dp(500, coins));
        System.out.println("hello, world");
        int hash = Objects.hash(1);
        int i = Objects.hashCode(hash);
        System.out.println(hash);
        System.out.println(i);

    }


}
