package com.example.algorithm.test8;

/**
 * 背包问题，动态规划
 *
 * @author gzj
 * @date 2020/12/15 18:54
 */
public class dp {

    public static void main(String[] args){

        int[] value = {60, 120, 160};
        int[] weight = {10, 20, 30};

        int m = 3;
        int w = 50;
        int[][] dp = new int[m+1][w+1];

        for (int i = 1; i <= m; ++i) {
            for (int cw = 1; cw <= w; ++cw) {
                if (weight[i-1] <= cw) {
                    if (value[i-1] + dp[i-1][cw - weight[i-1]] > dp[i-1][cw]) {
                        dp[i][cw] = value[i-1] + dp[i-1][cw - weight[i-1]];
                    }
                    else {
                        dp[i][cw] = dp[i-1][cw];
                    }
                }
                else {
                    dp[i][cw] = dp[i-1][cw];
                }
            }
        }

        System.out.println(dp[m][w]);

        for (int i = m; i >= 1; --i) {
            if (dp[i][w] != dp[i-1][w]) {
                System.out.println(i + " : " + weight[i-1]);
                w = w - weight[i-1];
            }
        }
        System.out.println(w);

    }
}
