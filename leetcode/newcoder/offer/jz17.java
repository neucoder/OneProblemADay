package newcoder.offer;

public class jz17 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if(root2==null){
                return false;
            }
            if(root1==null){
                return false;
            }

            return subTree(root1, root2)||subTree(root1.left, root2)||subTree(root1.right, root2);
        }

        public boolean subTree(TreeNode r1, TreeNode r2){
            if(r2==null){
                return true;
            }
            if(r1==null){
                return false;
            }

            if(r1.val==r2.val){
                return subTree(r1.left, r2.left)&&subTree(r1.right, r2.right);
            }else{
                return false;
            }

        }
    }
}
