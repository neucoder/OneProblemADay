package com.leetcode.problems;

import com.leetcode.datastructs.TreeNode;

class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0)
        {
            return null;
        }
        TreeNode root = build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if(postStart > postEnd)
        {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if(inorder[i]==postorder[postEnd])
            {
                index = i;
                break;
            }
        }
        int leftsize = index - inStart;
        root.left = build(inorder, inStart, index-1,postorder,postStart,postStart+leftsize-1 );
        root.right = build(inorder,index+1,inEnd, postorder,postStart+leftsize,postEnd-1);
        return root;
    }

}

public class Problem106 {
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        Solution106 s = new Solution106();
        TreeNode root = s.buildTree(inorder, postorder);
        System.out.println("hello, world");
    }
}
