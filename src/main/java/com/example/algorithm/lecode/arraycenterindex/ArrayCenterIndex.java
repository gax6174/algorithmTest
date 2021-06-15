package com.example.algorithm.lecode.arraycenterindex;

import java.util.Arrays;

/**
 * 返回数组元素中心下标，
 * 中心下标左所有元素的和，等于右所有元素的和
 * @author seek
 */
public class ArrayCenterIndex {

    public static void main(String[] args) {

        System.out.println(pivotIndex2(new int[] {1,2,3,4,6,10}));
        System.out.println(pivotIndex(new int[] {1,2,3,4,6,10}));
    }

    private static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0; i < nums.length; ++i) {
            total += nums[i];
            if (total == sum) {
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }

    private static int pivotIndex2(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * total + nums[i] == sum) {
                return i;
            }
            total += nums[i];
        }
        return -1;
    }
}
