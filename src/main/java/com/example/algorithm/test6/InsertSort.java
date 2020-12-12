package com.example.algorithm.test6;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @author gzj
 * @date 2020/12/12 16:17
 */
public class InsertSort {



    public static void main(String[] args){

        int[] a = {9, 8, 7, 0, 1, 3, 2};
        insSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int data  = a[i];

            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > data) {
                    a[j + 1] = a[j];
                }
                else {
                    // 精髓所在，因为前面已经排好序
                    break;
                }
            }

            a[j + 1] = data;
            System.out.print("第" + i + "次排序结果为：");
            for (j = 0; j < n; ++j) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

}
