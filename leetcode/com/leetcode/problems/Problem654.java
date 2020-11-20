package com.leetcode.problems;

//最大二叉树

import com.leetcode.datastructs.TreeNode;

class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length==0)
        {
            return null;
        }
        TreeNode root = treeBuild(nums, 0, nums.length-1);
        return root;
    }

    public TreeNode treeBuild(int [] nums, int left, int right){
        if(left==right)
        {
            return new TreeNode(nums[left]);
        }
        if(left>right)
        {
            return null;
        }
        int i = maxIndex(nums, left, right);
        TreeNode root = new TreeNode(nums[i]);
        root.left = treeBuild(nums, left, i-1);
        root.right = treeBuild(nums,i+1, right);
        return root;
    }

    public int maxIndex(int[] nums, int left,int right)
    {
        int index = left;
        for (int i = left; i <= right; i++) {
            if(nums[i]>nums[index])
            {
                index = i;
            }
        }
        return index;
    }
}


public class Problem654 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution654 s = new Solution654();
        TreeNode r = s.constructMaximumBinaryTree(nums);



        System.out.println("hello");
    }
}
