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
        index = 0;
    }


    public void insert(int loc, int value) {
        if (index++ < size) {
            // 注意是 size - 1
            for (int i = size-1; i > loc; --i) {
                data[i] = data[i-1];
            }
            data[loc] = value;
        }
        else {
            // 扩容

        }
    }

    public void delete(int loc) {
        for (int i = loc; i < size; ++i) {
            if (i != size-1) {
                data[i] = data[i+1];
            }
            else {
                data[i] = 0;
            }
        }
        index --;
    }

    public int get(int loc) {
        return data[loc];
    }

    public void update(int loc, int value) {
        data[loc] = value;
    }

    public static void main(String[] args) {

        ArrayTest array = new ArrayTest(10);
        array.insert(0, 0);
        array.insert(1, 1);
        array.insert(3, 3);
        array.insert(5, 5);
        array.insert(6, 6);
        System.out.println(array.get(0));
        System.out.println(array.get(5));
        array.update(5, 7);
        System.out.println(array.get(5));
        array.delete(5);
        System.out.println(array.get(5));
    }
}
