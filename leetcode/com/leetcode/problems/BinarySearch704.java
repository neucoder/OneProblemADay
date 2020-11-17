package com.leetcode.problems;

class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }else if(nums[mid] > target)
            {
                right = mid-1;
            }else if(nums[mid] < target)
            {
                left = mid + 1;
            }
        }


        return -1;
    }
}



public class BinarySearch704 {
    public static void main(String[] args) {
        Solution704 solution704 = new Solution704();
        int search = solution704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println(search);
        System.out.println("hello, world");
    }
}
