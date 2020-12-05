package com.example.algorithm.test0;

/**
 * @author gzj
 * @date 2020/12/5 19:18
 */
public class BigO {

    public static void main(String[] args){

        // 运行1次，时间复杂度 O(1)
        int a = 1;

        // 运行4次，for循环比里面的多运行一遍，i = 0/1/2/3，
        for (int i = 0; i < 3; ++i) {
            // 运行3次，O(3) -> O(1)
            a = a + i;
        }

        // 表示n是未知
        int n = Integer.MAX_VALUE;

        int i = 1;

        while(i <= n) {
            // i 的值，2 4 8 16 ... 2^n
            // 计算次数x -> 2^x = n -> x = log2n -> 计算机忽略常数 -> logn -> O(logn)
            i = i * 2;
        }

        while(i <= n) {
            // O(logn)
            i = i * 3;
        }

        // O(nlogn)
        for (int j = 1; j < n; ++j) {
            while(i <= n) {
                // i 的值，2 4 8 16 ... 2^n
                // 计算次数x -> 2^x = n -> x = log2n -> 计算机忽略常数 -> logn -> O(logn)
                i = i * 2;
            }
        }

        for (i = 0; i < n; ++i) {
            // 运行了多少次? O(n)，n 一定是未知的
            a = a + i;
        }


        // O(n^2)
        for (i = 0; i < n; ++i) {
            for (int j = 1; j < n; ++j) {
                a = a + i;
            }
        }

        // n*(n+1)/2 -> 忽略常数 -> O(n^2)
        // (n^2 + n)/2 -> 忽略常数 -> 规律：加减法找运行次数最多的 -> n^2
        for (i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                // 运行次数，1+2+3+...+n = n*(n+1)/2，等差数列求和
                a = a + i;
            }
        }
    }
}
