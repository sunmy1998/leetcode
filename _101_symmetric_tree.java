/**
 * @author: SMY
 * @time: 2025/6/23  22:13
 * @description: 101. 对称二叉树
 */

public class _101_symmetric_tree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;

        boolean compareOutside = compare(left.left, right.right);
        boolean compareInside = compare(left.right, right.left);

        return compareOutside && compareInside;
    }

}
