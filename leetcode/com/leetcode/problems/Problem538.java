package com.leetcode.problems;


import com.leetcode.datastructs.TreeNode;

class Solution538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }

        traverse(root.right);
        sum+=root.val;
        root.val = sum;
        traverse(root.left);

    }
}

public class Problem538 {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
