package com.example.algorithm.test7;

import java.util.Arrays;

/**
 * @author gzj
 * @date 2020/12/13 16:18
 */
public class QuiklySort {

    public static void qSort(int[] data, int left, int right) {
        int base = data[left];
        int ll = left;
        int rr = right;
        while (ll < rr) {

            while (ll < rr && data[rr] >= base) {
                rr--;
            }
            if (ll < rr) {
                int temp = data[rr];
                data[rr] = data[ll];
                data[ll] = temp;
                ll++;
            }

            while (ll < rr && data[ll] <= base) {
                ll ++;
            }
            if (ll < rr) {
                int temp = data[rr];
                data[rr] = data[ll];
                data[ll] = temp;
                rr--;
            }
        }
        if (left < ll) {
            qSort(data, left, ll - 1);
        }
        if (ll < right) {
            qSort(data, ll + 1, right);
        }
    }

    public static void main(String[] args){
        int[] a = new int[]{5, 6, 1, 7, 4};
        int n = a.length;
        qSort(a, 0, n-1);
        System.out.println(Arrays.toString(a));
    }
}
