public class Knapsack {
    int knapsack(int N, int W, int[] wt, int[] val) {
        // vector 全填入 0，base case 已初始化
        int[][] dp = new int[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (w - wt[i-1] < 0) {
                    // 当前背包容量装不下，只能选择不装入背包
                    dp[i][w] = dp[i - 1][w];
                } else {
                    // 装入或者不装入背包，择优
                    dp[i][w] = Math.max(dp[i - 1][w - wt[i-1]] + val[i-1],
                            dp[i - 1][w]);
                }
            }
        }

        return dp[N][W];
    }

    public static void main(String[] args) {
        Knapsack s = new Knapsack();
        int knapsack = s.knapsack(3, 4, new int[]{2,1,3}, new int[]{4,2,3});
        System.out.println(knapsack);
    }
}
