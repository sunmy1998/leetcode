/**
 * @author: SMY
 * @time: 2025/6/26  23:23
 * @description: 222. 完全二叉树的节点个数
 *   <a href="https://leetcode.cn/problems/count-complete-tree-nodes/description/">...</a>
 */

public class _222_count_complete_tree_nodes {

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

    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
