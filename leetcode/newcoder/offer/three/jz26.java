package newcoder.offer.three;

import java.util.ArrayList;

public class jz26 {


     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {
        public TreeNode Convert1(TreeNode pRootOfTree) {
            if(pRootOfTree==null){
                return null;
            }
            TreeNode left = Convert1(pRootOfTree.left);
            TreeNode p = left;
            if(left==null){
                left = pRootOfTree;
            }else {
                while (p.right!=null){
                    p  = p .right;
                }
                pRootOfTree.left = p;
                p.right = pRootOfTree;
            }


            TreeNode right = Convert1(pRootOfTree.right);
            pRootOfTree.right = right;
            if(right!=null){
                right.left = pRootOfTree;
            }
            return left;
        }


        public TreeNode Convert(TreeNode pRootOfTree) {
            if(pRootOfTree==null){
                return null;
            }
            ArrayList<TreeNode> list = new ArrayList<>();
            ConvertHelp(list, pRootOfTree);
            TreeNode head = list.get(0);
            TreeNode p = head;
            for (int i = 1; i < list.size(); i++) {
                TreeNode treeNode = list.get(i);
                treeNode.left = p;
                p.right = treeNode;
                p = treeNode;

            }

            return head;
        }

        public void ConvertHelp(ArrayList<TreeNode> list, TreeNode pRootOfTree) {
            if(pRootOfTree!=null){
                ConvertHelp(list, pRootOfTree.left);
                list.add(pRootOfTree);
                ConvertHelp(list,pRootOfTree.right);
            }
        }
    }

}
