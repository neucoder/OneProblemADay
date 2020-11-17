package com.leetcode.problems;


import com.leetcode.datastructs.TreeNode;

class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        if(root.left!=null||root.right!=null)
        {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;

            invertTree(root.left);

            invertTree(root.right);
        }
        return root;
    }
}

public class Invertbinarytree226 {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(4);
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(7);
        r.left = treeNode;
        r.right = treeNode1;
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(9);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode1.left = treeNode4;
        treeNode1.right = treeNode5;
        Solution226 solution226 = new Solution226();
        TreeNode treeNode6 = solution226.invertTree(r);

        System.out.println("********************************************");
    }
}
