package newcoder.offer.four;

public class jz39 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if(root==null){
                return true;
            }

            int hight = hight(root.left);
            int hight1 = hight(root.right);
            if(!(Math.abs(hight(root.left)-hight(root.right))<=1)){
                return false;
            }
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        }
        public int hight(TreeNode root){
            if(root==null){
                return 0;
            }
            int l = hight(root.left);
            int r = hight(root.right);
            return 1+Math.max(l, r);
        }
    }

    public static void main(String[] args) {

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r5.left = r6;
        Solution solution = new Solution();
        System.out.println(solution.hight(r1));
        System.out.println(solution.IsBalanced_Solution(r1));


    }
}
