import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/15  10:23
 * @description: 429. N 叉树的层序遍历
 */

public class _429_n_ary_tree_level_order_traversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,0,ans);
        return ans;
    }

    private void dfs(Node root, int i, List<List<Integer>> ans) {
        if (root == null) return;
        i++;

        if (i > ans.size()) ans.add(new ArrayList<>());
        ans.get(i-1).add(root.val);

        int finalI = i;
        root.children.forEach(node -> dfs(node, finalI, ans));
    }

}
