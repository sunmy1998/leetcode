/**
 * @author: SMY
 * @time: 2025/6/30  19:30
 * @description: 513. 找树左下角的值
 * <a href="https://leetcode.cn/problems/find-bottom-left-tree-value/description/">...</a>
 */

public class _513_find_bottom_left_tree_value {

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


    private int deep = -1;
    private int value = 0;

    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root, 0);
        return value;
    }

    private void findLeftValue(TreeNode node, int level) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            if (level > deep) {
                deep = level;
                value = node.val;
            }
        }

        if (node.left != null) findLeftValue(node.left, level + 1);
        if (node.right != null) findLeftValue(node.right, level + 1);
    }

}
