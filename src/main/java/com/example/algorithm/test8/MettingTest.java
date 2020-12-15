package com.example.algorithm.test8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 开会问题，贪心算法
 *
 * @author gzj
 * @date 2020/12/15 19:47
 */
class Metting implements Comparable<Metting> {

    int num;
    int start;
    int end;

    public Metting(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Metting{" +
                "num=" + num +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public int compareTo(Metting o) {
        return this.end > o.end ? 1 : -1;
    }
}


public class MettingTest {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        List<Metting> meetings = new ArrayList<>();
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            int start = cin.nextInt();
            int end = cin.nextInt();
            Metting metting = new Metting(i + 1, start, end);
            meetings.add(metting);
        }

        meetings.sort(null);

        int cur = 0;

        for (int i = 0; i < n; ++i) {
            Metting metting = meetings.get(i);
            if (metting.start >= cur) {
                System.out.println(metting);
                cur = metting.end;
            }
        }
    }
}
