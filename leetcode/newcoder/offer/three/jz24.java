package newcoder.offer.three;

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
            if(root==null){
                return res;
            }
            list.add(root.val);
            target-=root.val;
            if(target==0&&root.left==null&&root.right==null){
                res.add(new ArrayList<>(list));
            }
            FindPath(root.left, target);
            FindPath(root.right, target);
            list.remove(list.size()-1);
            return res;

        }


    }

    public static void main(String[] args) {
        System.out.println("hello, world");
    }

}
