class Solution {
    public int maxArea(int[] height) {
        int L = 0;
        int R = height.length - 1;
        int maxOutput = 0;

        while (L < R) {
            int output = (R - L) * Math.min(height[L], height[R]);
            if (output > maxOutput) {
                maxOutput = output;
            }
            if(height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }
        return maxOutput;
    }
}