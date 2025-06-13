import java.util.LinkedList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/13  22:40
 * @description: 199. 二叉树的右视图
 * <a href="https://leetcode.cn/problems/binary-tree-right-side-view/description/">...</a>
 */

public class _199_binary_tree_right_side_view {


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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        dfs(root, 1, ans);
        return ans;
    }

    public void dfs(TreeNode node, int i, List<Integer> ans) {
        if (node == null) return;

        if (i > ans.size()) ans.add(node.val);

        dfs(node.right, i + 1, ans);
        dfs(node.left, i + 1, ans);
    }

}
