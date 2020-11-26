package com.leetcode.problems;



import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Codec {

    StringBuilder sb = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return sb.append("#").append(",").toString();
        }
        sb.append(root.val).append(",");
        String left = serialize(root.left);
        String right = serialize(root.right);

        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] treeArr = data.split(",");
        LinkedList<String> t = new LinkedList<>();
        for(String s: treeArr)
        {
            t.add(s);
        }

        TreeNode root = deserialize(t);
        return root;
    }

    public TreeNode deserialize(LinkedList<String> t){
        if(t.size()==0)
        {
            return null;
        }
        String s = t.removeFirst();
        if(s.equals("#"))
        {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = deserialize(t);
        root.right = deserialize(t);
        return root;

    }
}


public class Problem297 {
    public static void main(String[] args) {

        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        r1.left = r3;
        r.left = r1;
        r.right = r2;
        Codec c = new Codec();
        String s = c.serialize(r);
        System.out.println(s);
        String data = ",";
        String[] treeArr = data.split(",");
        TreeNode d = c.deserialize(s);
        System.out.println("hello, world");
    }
}
