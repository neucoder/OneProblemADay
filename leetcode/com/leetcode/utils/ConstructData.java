package com.leetcode.utils;


import com.leetcode.datastructs.TreeNode;

import java.util.List;

public class ConstructData {


    public static TreeNode createTree(List<Integer> list, int index){
        TreeNode root = null;
        if(index <= list.size())
        {
            if(list.get(index)==null)
            {
                return null;
            }
            root = new TreeNode(list.get(index));
            root.left = createTree(list, 2*index+1);
            root.right = createTree(list, 2*index+2);
        }
        return root;
    }
    public static void Test()
    {
        System.out.println("test..........");
    }


}
