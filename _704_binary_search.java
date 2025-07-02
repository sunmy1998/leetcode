/**
 * @author: SMY
 * @time: 2025/7/2  10:44
 * @description: 704. 二分查找
 * <a href="https://leetcode.cn/problems/binary-search/description/">...</a>
 */

public class _704_binary_search {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
