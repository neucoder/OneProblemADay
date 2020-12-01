package com.leetcode.problems;


class countNodes{
    public int countNodes(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }
}

public class 二叉树的节点数 {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        r.left = r1;
        r.right = r2;
        countNodes s = new countNodes();
        int i = s.countNodes(r);
        System.out.println(i);
        System.out.println("hello, world");
    }
}
