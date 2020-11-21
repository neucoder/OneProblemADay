package com.leetcode.problems;

import com.leetcode.datastructs.TreeNode;

class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

        return root;
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd, int [] inorder, int inStart, int inEnd)
    {
        if(preStart > preEnd)
        {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);

        int index = 0;

        for (int i = inStart; i <= inEnd; i++) {
            if(preorder[preStart]==inorder[i])
            {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        root.left = build(preorder, preStart+1,preStart+leftSize ,inorder, inStart,index-1 );
        root.right = build(preorder,preStart+leftSize+1 ,preEnd ,inorder, index+1, inEnd);

        return root;
    }
}



public class Problem105 {
    public static void main(String[] args) {


        Solution105 s = new Solution105();

        int[] pre = {3,9,20,15,7};
        int[] post = {9,3,15,20,7};

        TreeNode root = s.buildTree(pre, post);


        System.out.println("Hello, World");
    }
}
