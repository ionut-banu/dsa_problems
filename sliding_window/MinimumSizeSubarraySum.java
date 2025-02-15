package sliding_window;

class MinimumSizeSubarraySum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int L = 0;
            int R = 0;

            int minLength = Integer.MAX_VALUE;

            int curSum = 0;

            while (R < nums.length) {
                curSum += nums[R];
                if (curSum >= target) {
                    if (R - L + 1 < minLength) {
                        minLength = R - L + 1;
                    }
                    L++;
                    R = L;
                    curSum = 0;
                } else {
                    R++;
                }
            }
            if (minLength == Integer.MAX_VALUE) {
                return 0;
            }
            return minLength;
        }
    }
}
