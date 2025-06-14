import java.util.ArrayList;
import java.util.List;

/**
 * @author: SMY
 * @time: 2025/6/14  10:44
 * @description: 637. 二叉树的层平均值
 */

public class _637_average_of_levels_in_binary_tree {

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        dfs(root, 0, list);

        ArrayList<Double> ans = new ArrayList<>();

        list.stream()
                .map(subList -> subList.stream().mapToInt(Integer::intValue).average().orElse(0.0))
                .forEach(ans::add);

        return ans;
    }

    public void dfs(TreeNode root, int level, List<List<Integer>> list) {

        if (root == null) return;
        level++;

        if (level > list.size()) {
            list.add(new ArrayList<>());
        }

        list.get(level - 1).add(root.val);

        dfs(root.left, level, list);
        dfs(root.right, level, list);

    }

}
