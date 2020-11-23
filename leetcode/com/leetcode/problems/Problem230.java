package com.leetcode.problems;

import com.leetcode.datastructs.TreeNode;

import java.util.LinkedList;

class Solution230 {
    int rank = 0;
    int res = 0;
    LinkedList<Integer> result = new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {


        traverse(root, k);
        return res;
    }
    public void traverse1(TreeNode root, int k)
    {
        if(root==null)
        {
            return;
        }
        traverse1(root.left, k);
        result.add(root.val);
        traverse1(root.right, k);
    }
    public void traverse(TreeNode root, int k){
        if(root==null)
        {
            return;
        }
        traverse(root.left, k);
        rank++;
        if(rank==k)
        {
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }
}

public class Problem230 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        Solution230 s = new Solution230();
        int i = s.kthSmallest(t1, 2);

        System.out.println(i);
        System.out.println("hello, world");
    }
}
