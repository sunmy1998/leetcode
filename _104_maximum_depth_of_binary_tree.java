/**
 * @author: SMY
 * @time: 2025/6/19  23:03
 * @description: 104. 二叉树的最大深度
 *   <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/">...</a>
 */

public class _104_maximum_depth_of_binary_tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}
