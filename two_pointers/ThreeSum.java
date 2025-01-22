package two_pointers;

import java.util.*;

class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();

            if (nums.length < 3) {
                return result;
            }

            if (nums[0] > 0) {
                return result;
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int L = 0; L < nums.length - 2; L++) {
                if (nums[L] > 0) {
                    break;
                }

                for (int R = L + 1; R < nums.length - 1; R++) {
                    int required = -1 * (nums[L] + nums[R]);
                    if (map.containsKey(required) && map.get(required) > R) {
                        result.add(Arrays.asList(nums[L], nums[R], required));
                    }
                    R = map.get(nums[R]);
                }
                L = map.get(nums[L]);
            }
            return result;
        }
    }
}