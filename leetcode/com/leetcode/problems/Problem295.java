package com.leetcode.problems;


import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> large;

    /** initialize your data structure here. */
    public MedianFinder() {
        small = new PriorityQueue<>();
        large = new PriorityQueue<>((a, b)->{return b-a;});
    }

    public void addNum(int num) {
        if(small.size()>=large.size())
        {
            small.offer(num);
            large.offer(small.poll());
        }else{
            large.offer(num);
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if(small.size()>large.size())
        {
            return small.peek();
        }
        if(large.size()>small.size())
        {
            return large.peek();
        }


        return 1.0*(small.peek()+ large.peek())/2;
    }
}


public class Problem295 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        q1.offer(3);
        q1.offer(1);
        q1.offer(5);
        q2.offer(56);
        q2.offer(34);
        q2.offer(111);
        //q2.offer(1111);
        int n = q2.size();
        for (int i = 0; i < n; i++) {
            System.out.println(q2.poll());
        }
        System.out.println("hello, world");
    }
}
