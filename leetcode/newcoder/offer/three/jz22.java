package newcoder.offer.three;

import java.util.*;

public class jz22 {


     public static class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public static class Solution {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            Set<TreeNode> s = new HashSet<>();
            ArrayList<Integer> res = new ArrayList<>();
            if(root==null){
                return res;
            }
            q.offer(root);
            while (!q.isEmpty()){
                TreeNode poll = q.poll();
                res.add(poll.val);


                if(!s.contains(poll)){
                    if(poll.left!=null){
                        q.offer(poll.left);
                    }
                    if(poll.right!=null)
                    {
                        q.offer(poll.right);
                    }

                    s.add(poll);
                }

            }
            return res;
        }


    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.poll();
        q.poll();
        q.poll();
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(5);
        r.left = r1;
        r.right = r2;
        r1.left = r3;
        r1.right = r4;
        Solution solution = new Solution();
        ArrayList<Integer> integers = solution.PrintFromTopToBottom(r);


        System.out.println();
    }
}
