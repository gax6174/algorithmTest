package com.example.algorithm.test0;

/**
 * 1、判断一个数是否是2的N次方
 *
 * 【算法 - 敲门砖】
 *
 * @author gzj
 * @date 2020/12/5 18:18
 */
public class test0 {

    /**
     * 解题思路：
     *
     * 次方  十进制  二进制
     *      0
     * 2^0  1  01
     * 2^1  2  10
     *
     *      3  011
     * 2^2  4  100
     *
     *      7  0111
     * 2^3  8  1000
     *
     *      15  01111
     * 2^4  16  10000
     *
     * (n & (n-1)) == 0 ? true : false
     *
     */

    private static boolean t(int n) {
        if (n > 1)
            return (n & (n - 1)) == 0;
        return false;
    }

    public static void main(String[] args){

        for (int i = 0; i < 1000; ++i) {
            if (t(i))
                System.out.println(i + " : " + t(i));
        }
    }
}
