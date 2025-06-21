/**
 * @author: SMY
 * @time: 2025/6/21  23:07
 * @description: 111. 二叉树的最小深度
 *   <a href="https://leetcode.cn/problems/minimum-depth-of-binary-tree/description/">...</a>
 */

public class _111_minimum_depth_of_binary_tree {

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


    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(root.left == null || root.right == null) return left + right + 1;

        return Math.min(left, right) + 1;
    }

}
