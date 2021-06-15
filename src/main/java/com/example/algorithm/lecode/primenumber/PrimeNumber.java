package com.example.algorithm.lecode.primenumber;

/**
 * 统计n以内的素数个数
 * 素数：只能被1和自身整除的自然数，0、1除外
 * @author seek
 */
public class PrimeNumber {


    public static void main(String[] args) {

        System.out.println(bf(100));
        System.out.println(eratosthenes(100));
    }

    private static int bf(int n) {
        int count  = 0;
        for (int i = 2; i < n; ++i) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 埃筛法
     * @param n
     * @return
     */
    private static int eratosthenes(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }
}
