import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/12  21:56
 * @description: 107. 二叉树的层序遍历 II
 *   <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/description/"></a>
 */

public class _107_binary_tree_level_order_traversal_ii {

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        checkFunc(root,0,list);
        return list.reversed();
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
