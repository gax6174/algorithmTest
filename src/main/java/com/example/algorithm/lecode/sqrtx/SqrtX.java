package com.example.algorithm.lecode.sqrtx;

/**
 * x的平方根，不使用sqrt(x)，得到x平方根的整数部分
 * @author seek
 */
public class SqrtX {

    public static void main(String[] args) {

        System.out.println(binarySearch(25));
        System.out.println(newton(24));
    }

    /**
     * 二分
     * @param x
     * @return
     */
    private static int binarySearch(int x) {
        int index = -1, l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                index = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return index;
    }

    /**
     * 牛顿迭代
     * @param x
     * @return
     */
    private static int newton(int x) {
        if (0 == x) {
            return -1;
        }
        return (int)sqrt(1, x);
    }

    private static double sqrt(double i, int x) {
        double res = (i + x/i) / 2;
        if (res == i) {
            return i;
        }
        else {
            return sqrt(res, x);
        }
    }
}
