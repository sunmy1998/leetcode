import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/18  23:03
 * @description: 117. 填充每个节点的下一个右侧节点指针 II
 *   <a href="https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/description/">...</a>
 */

public class _117_populating_next_right_pointers_in_each_node_ii {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    private final List<Node> pre = new ArrayList<>();

    public Node connect(Node root) {
        dfs(root, 0);
        return root;
    }

    private void dfs(Node root, int level){
        if(root == null) return;

        if(level == pre.size()){
            pre.add(root);
        }else{
            pre.get(level).next = root;
            pre.set(level, root);
        }

        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }

}
