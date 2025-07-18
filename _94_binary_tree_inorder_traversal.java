import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: SMY
 * @time: 2025/6/7  11:01
 * @description: 94. 二叉树的中序遍历
 *   <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/">...</a>
 */

public class _94_binary_tree_inorder_traversal {

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

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        inorder(root,list);
//        return list;
//    }
//
//    private void inorder(TreeNode root, List<Integer> list){
//        if(root == null) return;
//
//        inorder(root.left, list);
//        list.add(root.val);
//        inorder(root.right, list);
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }else{
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }

        return list;

    }

}
