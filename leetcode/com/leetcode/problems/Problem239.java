package com.leetcode.problems;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Solution239 {
    /**
     * 方法1 结果是 使用优先队列 超时
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        class priQueue{
            private LinkedList<Integer> q = new LinkedList<>();
            public void push(int n){
                while (!q.isEmpty()&&q.getLast()<n)
                {
                    q.removeLast();
                }
                q.addLast(n);
            }

            public int max(){

                return q.getFirst();
            }

            public void pop(int n){
                if(n==q.getFirst())
                {
                    q.removeFirst();
                }
            }

        }
        ArrayList<Integer> res = new ArrayList<>();
        priQueue queue = new priQueue();
        for (int i = 0; i < nums.length; i++) {
            if(i<k-1)
            {
                queue.push(nums[i]);
            }else {
                queue.push(nums[i]);
                res.add(queue.max());
                queue.pop(nums[i+1-k]);
            }

        }
        int[] r = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;

    }

//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> {return b-a;});
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(queue.size()<k)
//            {
//                queue.add(nums[i]);
//            }
//            if(queue.size()==k)
//            {
//                res.add(queue.peek());
//                queue.remove(nums[i+1-k]);
//            }
//        }
//        int[] r = new int[res.size()];
//        for (int i = 0; i < res.size(); i++) {
//            r[i] = res.get(i);
//        }
//        return r;
//    }
}




public class Problem239 {
    public static void main(String[] args) throws IOException {

        String path = Problem239.class.getResource("data.txt").getPath();
        FileReader data = new FileReader(new File(path));
        StringBuilder sb = new StringBuilder();
        char[] buffer =  new char[1024*8];
        while (data.read(buffer)!=-1)
        {
            sb.append(buffer);
        }
        System.out.println(buffer);
        System.out.println(sb.length());
        String[] split = sb.toString().split(",");
        System.out.println(split.length);

        int[] nums = new int[101087];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        Solution239 s = new Solution239();

        int k = 50000;
        int[] ints = s.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));
        System.out.println("test");
    }
}
