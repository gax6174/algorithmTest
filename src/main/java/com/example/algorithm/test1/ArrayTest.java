package com.example.algorithm.test1;

/**
 * 数组练习
 *
 * 方法增删改查、初始化等
 *
 * @author gzj
 * @date 2020/12/6 14:36
 */
public class ArrayTest {

    private int size;

    private int[] data;

    private int index;

    public ArrayTest(int size) {
        this.size = size;
        data = new int[size];
    }


    public void insert(int index, int value) {
        if (index++ < size) {
            for (int i = size-1; i > index; --i) {
                data[i] = data[i-1];
            }
            data[index] = value;
        }
        else {
            // 扩容

        }
    }

    public void delete(int index) {
        if (index < size) {
            for (int i = index; i < size-1; ++i) {
                data[i] = data[i+1];
            }
            data[size - 1] = 0;
        }
    }

    public int get(int index) {
        return data[index];
    }

    public void update(int index, int value) {
        data[index] = value;
    }
}
