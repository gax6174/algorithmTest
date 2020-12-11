package com.example.algorithm.test4;

/**
 * 队列 - 数组实现
 *
 * @author gzj
 * @date 2020/12/10 9:22
 */
public class ArrayQueue {

    private int[] data;

    private int head = 0;

    private int tail = 0;

    /** 最大容量，可存放多少个元素 */
    private int n = 0;

    ArrayQueue(int cap) {
        this.data = new int[cap];
        this.n = cap;
    }

    void push(int m) {
        if (tail == n) {
            move();
            if (tail == n) {
                return ;
            }
        }
        data[tail++] = m;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        return data[head++];
    }

    void move() {
        int a = tail - head;
        if (a < n) {
            for (int i = 0; i < a; ++i) {
                data[i] = data[head + i];
            }
            for (int i = a; i < n; ++i) {
                data[i] = 0;
            }
            tail = a;
            head = 0;
        }
    }

    boolean isEmpty() {
        return head == tail;
    }

    public static void main(String[] args){

        ArrayQueue queue = new ArrayQueue(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(1);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
