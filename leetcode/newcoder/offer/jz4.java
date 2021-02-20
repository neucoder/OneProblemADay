package newcoder.offer;

public class jz4 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0) {
            return null;
        }

        TreeNode tree = buildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return tree;
    }

    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preEnd < preStart || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                root.left = buildTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
                root.right = buildTree(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);
                break;
            }
        }

        return root;
    }


    public static void main(String[] args) {
        jz4 jz4 = new jz4();
        int[] pre = {1,2,4,3,5,6};
        int[] in = {4,2,1,5,3,6};
        TreeNode treeNode = jz4.reConstructBinaryTree(pre, in);
        System.out.println("hello, world");
    }
}
