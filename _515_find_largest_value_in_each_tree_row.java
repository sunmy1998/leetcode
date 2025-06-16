import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: SMY
 * @time: 2025/6/16  22:11
 * @description: 515. 在每个树行中找最大值
 */

public class _515_find_largest_value_in_each_tree_row {

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

    public List<Integer> largestValues(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        dfs(root, 0, list);

        return list.stream()
                .mapToInt(sub -> sub.stream().max(Integer::compareTo).orElse(0))
                .boxed()
                .toList();
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> list) {

        if (root == null) return;

        level++;

        if (level > list.size()) list.add(new ArrayList<>());

        list.get(level - 1).add(root.val);

        dfs(root.left, level, list);
        dfs(root.right, level, list);

    }


}
