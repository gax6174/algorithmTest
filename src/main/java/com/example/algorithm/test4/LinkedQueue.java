package com.example.algorithm.test4;

/**
 * 链表实现一个单向队列
 *
 * @author gzj
 * @date 2020/12/11 13:16
 */
public class LinkedQueue {

    private Node head;

    void push(int m) {
        if (head == null) {
            head = new Node(m);
        }
        else {
            Node cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(m);
        }
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void main(String[] args){
        LinkedQueue queue = new LinkedQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}

class Node {

    public int value;

    public Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}
