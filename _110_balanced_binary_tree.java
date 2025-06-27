/**
 * @author: SMY
 * @time: 2025/6/27  23:07
 * @description: 110. 平衡二叉树
 * <a href="https://leetcode.cn/problems/balanced-binary-tree/description/">...</a>
 */
public class _110_balanced_binary_tree {

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

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        int left = getHeight(node.left);
        if (left == -1) return -1;

        int right = getHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

}
