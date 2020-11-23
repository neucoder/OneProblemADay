package com.leetcode.problems;


import com.leetcode.datastructs.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * leetcode652 找到一棵树中所有的重复的子树
 **/
class Solution652 {
    List<TreeNode> res = new LinkedList<>();
    Map<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        subTrees(root);
        return res;
    }

    public String subTrees(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = subTrees(root.left);
        String right = subTrees(root.right);
        String subtree = left + "," + right + "," + root.val;
        int num = map.getOrDefault(subtree, 0);

        if (num == 1) {
            res.add(root);
        }

        map.put(subtree, num + 1);
        return subtree;
    }


}


public class Problem652 {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t5.left = t7;
        Solution652 s = new Solution652();
        List<TreeNode> duplicateSubtrees = s.findDuplicateSubtrees(t1);


        System.out.println("Hello, World");
    }
}
