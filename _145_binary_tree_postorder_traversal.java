import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/6  23:21
 * @description: 145. 二叉树的后序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/description/">...</a>
 */

public class _145_binary_tree_postorder_traversal {


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

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;

    }

    private void postorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }


}
