/**
 * @author: SMY
 * @time: 2025/7/1  13:04
 * @description: 112. 路径总和
 *   <a href="https://leetcode.cn/problems/path-sum/">...</a>
 */

public class _112_path_sum {

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

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null) return false;

            targetSum -= root.val;

            if(root.left == null && root.right == null) return targetSum == 0;

            if(root.left != null){
                boolean left = hasPathSum(root.left, targetSum);
                if(left) return true;
            }

            if(root.right != null){
                boolean right = hasPathSum(root.right, targetSum);
                if(right) return true;
            }

            return false;
        }
    }

}
