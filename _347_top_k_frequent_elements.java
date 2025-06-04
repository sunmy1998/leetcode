import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author: SMY
 * @time: 2025/6/4  21:39
 * @description: 347. 前 K 个高频元素
 *   <a href="https://leetcode.cn/problems/top-k-frequent-elements/description/">...</a>
 */

public class _347_top_k_frequent_elements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> p2[1] - p1[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
    }

}
