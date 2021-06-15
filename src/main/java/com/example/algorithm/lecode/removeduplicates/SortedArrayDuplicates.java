package com.example.algorithm.lecode.removeduplicates;

/**
 * 删除排序数组中的重复项，
 * 一个有序数组，原地删除重复元素，返回删除后数组长度
 * @author seek
 */
public class SortedArrayDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,1,2,2,3,3,4}));
    }

    /**
     * 双指针，快慢指针
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
