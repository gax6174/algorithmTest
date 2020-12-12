package com.example.algorithm.test6;

import java.util.Arrays;

/**
 * 归并排序，O(nlogn)
 *
 * @author gzj
 * @date 2020/12/12 18:37
 */
public class MegerSort {

    public static void main(String[] args){

        int[] a = {9, 8, 7, 0, 1, 3, 2};
        mergerSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergerSort(int[] data, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;
            mergerSort(data, left, mid);
            mergerSort(data, mid + 1, right);

            merge(data, left, mid, right);
        }

    }

    private static void merge(int[] data, int left, int mid, int right) {

        int[] temp = new int[data.length];

        int point1 = left;
        int point2 = mid + 1;
        int loc = left;

        while (point1 <= mid && point2 <= right) {
            if (data[point1] < data[point2]) {
                temp[loc++] = data[point1++];
            }
            else {
                temp[loc++] = data[point2++];
            }
        }

        while (point1 <= mid) {
            temp[loc++] = data[point1++];
        }
        while (point2 <= right) {
            temp[loc++] = data[point2++];
        }

        for (int i = left; i <= right; ++i) {
            data[i] = temp[i];
        }
    }

}
