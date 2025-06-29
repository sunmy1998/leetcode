/**
 * @author: SMY
 * @time: 2025/6/29  20:52
 * @description: 404. 左叶子之和
 * <a href="https://leetcode.cn/problems/sum-of-left-leaves/">...</a>
 */

public class _404_sum_of_left_leaves {

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

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        int mid = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            mid = root.left.val;
        }

        return mid + left + right;
    }
}
