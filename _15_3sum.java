import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/3sum/description/
 */
public class _15_3sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[0] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum < 0) {
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                }else if (sum > 0){
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                }else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        _15_3sum obj = new _15_3sum();
        System.out.println(obj.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
