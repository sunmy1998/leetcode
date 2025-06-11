import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/11  21:45
 * @description: 102. 二叉树的层序遍历
 *   <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal/description/">...</a>
 */

public class _102_binary_tree_level_order_traversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        checkFunc(root,0,list);
        return list;
    }

    private void checkFunc(TreeNode node, int level, List<List<Integer>> list){
        if (node == null) return;
        level++;

        if(list.size() < level){
            list.add(new ArrayList<>());
        }

        list.get(level-1).add(node.val);

        checkFunc(node.left, level, list);
        checkFunc(node.right, level, list);
    }

}
