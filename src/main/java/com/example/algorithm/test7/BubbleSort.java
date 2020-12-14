package com.example.algorithm.test7;

import java.util.Arrays;

/**
 * @author gzj
 * @date 2020/12/13 14:44
 */
public class BubbleSort {

    public static void main(String[] args){

        int[] a = new int[]{5, 6, 1, 7, 4};
        int n = a.length;

        for (int i = 0; i < n - 1; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; ++j) {
                if (a[j+1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        System.out.println(Arrays.toString(a));
    }
}
