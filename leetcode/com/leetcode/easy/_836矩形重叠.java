package com.leetcode.easy;

public class _836矩形重叠 {


    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];
        if(x2-x1==0 || y2-y1==0){
            return false;
        }
        int xx1 = rec2[0];
        int yy1 = rec2[1];
        int xx2 = rec2[2];
        int yy2 = rec2[3];
        if(xx2-xx1==0 || yy2-yy1==0){
            return false;
        }
        if(xx2<=x1) return false;
        if(x2<=xx1) return false;
        if(yy2<=y1) return false;
        if(y2<=yy1) return false;

        return true;
    }


    public static void main(String[] args) {
        String s = "".toString();

    }
}
