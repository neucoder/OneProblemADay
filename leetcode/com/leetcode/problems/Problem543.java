package com.leetcode.problems;


class Solution543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int left = treeLength(root.left);
        int right = treeLength(root.right);
        int res = left+right;
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        return Math.max(l, Math.max(r, res));
    }

    public int treeLength(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left = treeLength(root.left);
        int right = treeLength(root.right);
        return 1+Math.max(left, right);
    }
}

public class Problem543 {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
