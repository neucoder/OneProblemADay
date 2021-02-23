package newcoder.offer;

import java.util.ArrayList;

public class jz24 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            list.clear();
            ArrayList<Integer> integers = FindPathOne(root, target);
            if(integers!=null){
                res.add(integers);
            }
            FindPath(root.left, target);
            FindPath(root.right, target);
            return null;
        }

        public ArrayList<Integer> FindPathOne(TreeNode root, int target) {
            if(root==null){
                return null;
            }

            list.add(root.val);
            if(root.val==target){
                return list;
            }
            ArrayList<Integer> left = FindPathOne(root.left, target - root.val);
            ArrayList<Integer> right = FindPathOne(root.right, target - root.val);


            return left!=null ? left : right;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello, world");
    }

}
