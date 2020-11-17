package com.leetcode.problems;

import com.leetcode.datastructs.TreeNode;
import com.leetcode.utils.ConstructData;

import java.util.ArrayList;
import java.util.Arrays;

class Solution114 {
    public void flatten(TreeNode root) {

        if(root==null)
        {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;

        TreeNode p = root;
        while (p.right!=null)
        {
            p = p.right;
        }
        p.right = right;

    }
}

public class FlattenBinaryTreetoLinkedList114 {
    public static void main(String[] args) {


        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,5,3,4,null,6));
        TreeNode treeNode = ConstructData.buildTree(integers);

        Solution114 s = new Solution114();
        s.flatten(treeNode);

        System.out.println("Hello, world");
    }
}
