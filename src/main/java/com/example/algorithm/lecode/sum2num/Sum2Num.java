package com.example.algorithm.lecode.sum2num;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组两数之和等于目标值
 * 返回两个数的下标，每个输入唯一答案，不能取重复值
 * @author seek
 */
public class Sum2Num {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,6}, 3)));
        System.out.println(Arrays.toString(solution2(new int[]{1,2,3,4,5,6}, 3)));
    }

    private static int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    private static int[] solution2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}
