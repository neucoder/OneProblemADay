package newcoder.offer.two;

public class jz18 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {
        public TreeNode Mirror(TreeNode pRoot) {
            if(pRoot==null){
                return null;
            }

            TreeNode t = pRoot.left;
            pRoot.left = pRoot.right;
            pRoot.right = t;
            Mirror(pRoot.left);
            Mirror(pRoot.right);
            return pRoot;
        }
    }
}
