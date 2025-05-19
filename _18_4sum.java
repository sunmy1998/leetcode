import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/4sum/description/
 */
public class _18_4sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++) {
            if(nums[i] > target && nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length - 2; j++) {
                if(nums[i] + nums[j] > target && nums[i] + nums[j] > 0) break;
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = nums.length - 1;
                while(left < right) {
                    if(nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        while(left < right && nums[left] == nums[++left]);
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        while(left < right && nums[right] == nums[--right]);
                    }else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[++left]);
                        while(left < right && nums[right] == nums[--right]);
                    }
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {


        List<List<Integer>> list1 = new _18_4sum().fourSum(new int[]{1,0,-1,0,-2,2}, 8);
        assert list1.size() == 3;

        List<List<Integer>> list2 = new _18_4sum().fourSum(new int[]{2,2,2,2,2}, 8);
        assert list2.size() == 1;

        List<List<Integer>> list3 = new _18_4sum().fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11);
        assert list3.size() == 1;
    }

}
