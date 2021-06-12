package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//我们有 N 个与坐标轴对齐的矩形, 其中 N > 0,
//判断它们是否能精确地覆盖一个矩形区域。
//每个矩形用左下角的点和右上角的点的坐标来表示。
//例如， 一个单位正方形可以表示为 [1,1,2,2]。
//( 左下角的点的坐标为 (1, 1)
//以及右上角的点的坐标为 (2, 2) )。

/**
 *
 * */

public class _391PerfectRect {

    class Point{
        int x, y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public boolean isRectangleCover(int[][] rectangles) {
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        Set<Point> points = new HashSet<>();
        int area = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int a = rectangles[i][0];
            int b = rectangles[i][1];
            int c = rectangles[i][2];
            int d = rectangles[i][3];
            ArrayList<Point> ps = new ArrayList<>();
            Point p1 = new Point(a, b);
            Point p2 = new Point(c, d);
            Point p3 = new Point(a, d);
            Point p4 = new Point(c, b);
            ps.add(p1);
            ps.add(p2);
            ps.add(p3);
            ps.add(p4);
            for (int j = 0; j < ps.size(); j++) {
                if(points.contains(ps.get(j))){
                    points.remove(ps.get(j));
                }else {
                    points.add(ps.get(j));
                }
            }


            area += (c-a)*(d-b);

            x1 = Math.min(a, x1);
            y1 = Math.min(b, y1);
            x2 = Math.max(c, x2);
            y2 = Math.max(d, y2);
        }
        int Area = (x2-x1)*(y2-y1);
        if(area!=Area){
            return false;
        }
        if(points.size()!=4){
            return false;
        }
        if(!points.contains(new Point(x1, y1))) return false;
        if(!points.contains(new Point(x2, y2))) return false;
        if(!points.contains(new Point(x1, y2))) return false;
        if(!points.contains(new Point(x2, y1))) return false;
        return true;
    }
//    [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4]]
    private int[][] parseArr(String s){
        String sub = s.substring(2, s.length()-2);
        String[] split = sub.split("],\\[");
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < split1.length; j++) {
                arr.add(Integer.parseInt(split1[j]));
            }
            res.add(arr);
        }
        int[][] arr = new int[res.size()][res.get(0).size()];
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Integer> integers = res.get(i);
            for (int j = 0; j < integers.size(); j++) {
                arr[i][j]=integers.get(j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        _391PerfectRect pf = new _391PerfectRect();
        int[][] ints = pf.parseArr("[[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]");
        boolean res = pf.isRectangleCover(ints);
        System.out.println(res);
        System.out.println("test");
    }
}
