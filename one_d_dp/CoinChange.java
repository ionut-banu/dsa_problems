package one_d_dp;

import java.util.Arrays;

class CoinChange {
    class Solution {
        public int coinChange(int[] coins, int amount) {

            int[] dp = new int[amount + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;

            for (int coin : coins) {
                for (int j = coin; j <= amount; j++) {
                    if (dp[j - coin] != Integer.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                    }
                }
            }
            return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
        }
    }
}