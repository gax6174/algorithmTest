package com.example.algorithm.test1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 面试经典：
 * 给你一个文件里面包含全国人民（14亿）的年龄数据（0~180），现在要你统计每一个年龄有多少人?
 * 给定机器为 单台+2CPU+2G内存。不得使用现成的容器，比如map等。
 *
 * 排序的最高效算法：O(nlogn) 14亿不能排序，内存不够
 *
 * int a[] = new int[180];a[0]++;0表示的是0岁，a[0]的值表示的就是0有多少人.
 *
 * 下标：数组最优一个特点。这里可以通下标表示成有意义的数据，不只是数据里面的标记，年龄和下标对应。随机访问：可以直接通过下标定位到数组中的某一个数据
 *
 * @author gzj
 * @date 2020/12/5 22:07
 */
public class Test0 {
    
    public static void main(String[] args) throws IOException {

        String str = null;
        String fileName = "D://test.txt";

        InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
        int count = 0;
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(reader);
        int[] data = new int[200];
        while ((str = br.readLine()) != null) {
            int age = Integer.valueOf(str);
            data[age] ++;
            count ++;
        }

        for (int i = 0; i < 200; ++i) {
            System.out.println(i + " : " + data[i]);
        }

        System.out.println("总数据量为：" + count);
        System.out.println("计算耗时：" + (System.currentTimeMillis() - start) + " ms");
    }
}
