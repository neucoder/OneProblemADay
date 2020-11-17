package com.leetcode.utils;


import com.leetcode.datastructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

;

public class ConstructData {



    public static TreeNode buildTree(ArrayList<Integer> arr)
    {
        if(arr.size()<1)
        {
            return null;
        }

        TreeNode root = new TreeNode(arr.get(0));
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        int id = 1;
        while (nodes.size()>0 && id<arr.size())
        {
            TreeNode node = nodes.getFirst();
            node.left = arr.get(id)!=null ? new TreeNode(arr.get(id)) : null;
            nodes.add(node.left);
            node.right = arr.get(id+1)!=null ? new TreeNode(arr.get(id+1)) : null;
            nodes.add(node.right);
            id += 2;
            nodes.remove();

        }

        return root;

    }
    public static void Test()
    {
        System.out.println("test..........");
    }
}
