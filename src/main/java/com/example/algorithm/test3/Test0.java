package com.example.algorithm.test3;

/**
 * 约瑟夫问题，n个人站圈，干掉第m
 *
 * @author gzj
 * @date 2020/12/7 19:52
 */
public class Test0 {

    private static Node head;

    private static void circle() {
        int n = 41;
        Node cur = head;
        for (int i = 0; i <= n; ++i) {
            if (head == null) {
                head = new Node(i);
                cur = head;
            }
            else {
                if (i != n) {
                    cur.next = new Node(i);
                    cur = cur.next;
                }
                else {
                    cur.next = head;
                }
            }
        }
    }

    private static void report() {
        Node cur = head;
        while (cur.next != head) {
            System.out.println(cur.value);
            cur = cur.next;
        }
        System.out.println(cur.value);
        System.out.println();
    }

    private static void kill() {
        int m = 3;
        while(head != head.next) {
            for (int i = 1; i < m-1; ++i) {
                head = head.next;
            }
            remove();
        }
        System.out.println("存活 : " + head.value);
    }


    private static void remove() {
        System.out.println("kill : " + head.next.value);
        head.next = head.next.next;
        head = head.next;
    }

    public static void main(String[] args) {
        // 站圈
        circle();
        // 报数
        report();
        // 干掉第N
        kill();
    }
}

class Node {

    public int value;

    public Node next;

    Node(int value) {
        this.value = value+1;
        next = null;
    }
}
