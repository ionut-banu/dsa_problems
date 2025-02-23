package hashmap;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    return new int[] {i, map.get(nums[i])};
                }
                int diff = target - nums[i];
                map.put(diff, i);
            }
            return new int[0];
        }
    }
}
