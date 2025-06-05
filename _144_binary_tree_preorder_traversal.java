import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/5  22:16
 * @description: 144. 二叉树的前序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-preorder-traversal/description/">...</a>
 */

public class _144_binary_tree_preorder_traversal {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

}
