package com.example.algorithm.test8;

/**
 * 购物车问题，动态规划
 *
 * @author gzj
 * @date 2020/12/15 20:07
 */
public class CardDp {

    public static void main(String[] args){

        int[] weigth = {2,1,3,4,5,6,9};

        int w = 8;
        int n = 7;

        int[][] dp = new int[n+1][w+1];

        for (int i = 1; i <= n; ++i) {
            for (int cw = 1; cw <= w; ++cw) {
                if (weigth[i-1] <= cw) {
                    dp[i][cw] = Math.max(
                            weigth[i-1] + dp[i-1][cw - weigth[i-1]],
                            dp[i-1][cw]
                    );
                }
                else {
                    dp[i][cw] = dp[i-1][cw];
                }
            }
        }

        System.out.println(dp[n][w]);


        for (int i = n; i > 1; --i) {
            if (dp[i][w] != dp[i-1][w]) {
                System.out.println(i + " : " + weigth[i-1]);
                w = w - weigth[i-1];
            }
        }
        if (w > 0) System.out.println(1 + " : " + weigth[0]);
    }
}
