package com.example.algorithm.test6;

import java.util.Arrays;

/**
 * 插入 & 希尔排序
 *
 * @author gzj
 * @date 2020/12/12 16:17
 */
public class InsertSort {

    public static void main(String[] args){

        int[] a = {9, 8, 7, 2, 1, 3, 0};
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void shellSort(int[] a) {
        int n = a.length;

        // 注意几个循环条件的参数
        for (int add = n/2; add >= 1; add /= 2) {
            for (int i = add; i < n; ++i) {
                int data  = a[i];
                int j = i - add;
                // 注意这里大于等于0
                for (; j >= 0; j -= add) {
                    if (a[j] > data) {
                        a[j + add] = a[j];
                    }
                    else {
                        break;
                    }
                }
                a[j + add] = data;
                System.out.print("第" + i + "次排序结果为：");
                for (j = 0; j < n; ++j) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
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
