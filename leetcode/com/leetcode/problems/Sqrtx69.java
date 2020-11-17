package com.leetcode.problems;

class Solution69 {
    public int mySqrt(int x) {
        if(x==0)
        {
            return 0;
        }
        if(x==1||x==2)
        {
            return 1;
        }
        for (int i = 1; i <= x/2; i++) {
            if(i>=46335&&i<47000)
            {
                System.out.println(i*i);
            }
            if(i*i<=x && (i+1)*(i+1)>x)
            {
                return i;
            }
            if(i*i<=x&&(i+1)*(i+1)<0)
            {
                return i;
            }
        }
        return 1;
    }
}

public class Sqrtx69 {
    public static void main(String[] args) {
        Solution69 s = new Solution69();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" " + s.mySqrt(i));
        }

    }
}
