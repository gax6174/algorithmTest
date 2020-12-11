package com.example.algorithm.test4;

/**
 * 队列 - 数组实现
 *
 * @author gzj
 * @date 2020/12/10 9:22
 */
public class CircleArrayQueue {

    private int[] data;
    /** n - 最大容量，可存放多少个元素 */
    private int head = 0, tail = 0, n = 0;
    CircleArrayQueue(int cap) {
        this.data = new int[cap];
        this.n = cap;
    }

    void push(int m) {
        // 这里丢一个数据
        if ((tail + 1) % n == head) {
            return ;
        }
        data[tail] = m;
        tail = (tail + 1) % n;
    }

    public static void main(String[] args){
        CircleArrayQueue queue = new CircleArrayQueue(8);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);
        queue.push(15);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int m = data[head];
        data[head] = 0;
        head = (head + 1) % n;
        return m;
    }

    boolean isEmpty() {
        return head == tail;
    }
}
