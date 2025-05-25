/**
 * @author: SMY
 * @time: 2025/5/25  11:19
 * @description: 27. 移除元素
 *   <a href="https://leetcode.cn/problems/remove-element/description/">...</a>
 */

public class _27_remove_element {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }


}
