package com.leetcode.problems;

import com.leetcode.datastructs.TreeNode;

import java.util.*;

class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null)
        {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);



        while (!q.isEmpty())
        {
            int sz = q.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                list.add(cur.val);
                if(cur.left!=null)
                {
                    q.offer(cur.left);

                }
                if(cur.right!=null)
                {
                    q.offer(cur.right);

                }


            }
            res.add(0, list);

        }

        return res;
    }
}

public class Problem107 {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(0,4);
        integers.add(0,84);
        System.out.println("hello");
    }
}
