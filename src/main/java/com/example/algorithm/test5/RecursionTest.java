package com.example.algorithm.test5;

import java.util.Date;

/**
 * @author gzj
 * @date 2020/12/11 14:21
 */
public class RecursionTest {

    private static int[] data;


    /** O(2^n) */
    static int fibonacci(int i) {
        if (i <=2)
            return 1;
        return fibonacci(i-1) + fibonacci(i-2);
    }

    /** O(n) */
    static int fibonacci2(int i) {
        if (i <=2)
            return 1;
        if (data[i] > 0)
            return data[i];

        int res = fibonacci2(i - 1) + fibonacci2(i - 2);
        data[i] = res;
        return res;
    }

    /** O(n) */
    static int noFibonacci(int i) {
        if (i <= 2) return 1;
        int a = 1;
        int b = 1;
        int c = 0;
        for (int j = 3; j <= i; ++j) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /** 阶乘 */
    static int fac(int n) {
        if (n <= 1) return 1;
        return n * fac(n - 1);
    }

    /** 尾递归 - 阶乘 */
    static int tailFac(int n, int res) {
        if (n <= 1) return res;
        return tailFac(n - 1, n*res);
    }

    /** 尾递归 - 斐波那契 */
    static int tailFibonacci(int pre, int res, int n) {
        if (n <= 2) return res;
        return tailFibonacci(res, pre + res, n - 1);
    }

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        data = new int[46];
        for (int i = 1; i < 45; ++i) {
            System.out.println(tailFibonacci(1, 1, i) + " 所花费的时间为"
                    + (System.currentTimeMillis() - start) + "ms");
        }

//        for (int i = 1; i < 10; ++i) {
//            System.out.println(i + " : " + tailFac(i, 1));
//        }
    }
}
