package com.example.algorithm.test2;

/**
 * LinkedList seek
 *
 * @author gzj
 * @date 2020/12/7 9:17
 */
public class MyLinkedList {

    private ListNode head;

    private int size = 0;

    public static void main(String[] args){
        MyLinkedList myList = new MyLinkedList();
        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10);
        myList.print(); // 10 -> 7 -> 5
        myList.deleteNth(0);
        myList.print(); // 7 -> 5
        myList.deleteHead();
        myList.print(); // 5
        myList.insertNth(11, 1);
        myList.print(); // 5 -> 11
        myList.deleteNth(1);
        myList.print(); // 5
    }

    private void insertNth(int data, int position) {

        if (position == 0) {
            insertHead(data);
        }
        else {
            ListNode cur = head;
            for (int i = 1; i < position; ++i) {
                cur = cur.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }


    private void deleteHead() {
        head = head.next;
    }

    private void deleteNth(int position) {
        if (position == 0) {
            deleteHead();
        }
        else {
            ListNode cur = head;
            for (int i = 1; i < position; ++i) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    private void print() {

        ListNode cur = head;
        while(cur != null) {
            System.out.println(" " + cur.value);
            cur = cur.next;
        }

        System.out.println();
    }

    private void insertHead(int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = head;
        head = newNode;
    }

    private void find(int data) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == data) break;
            cur = cur.next;
        }
        System.out.println(cur);
    }
}

class ListNode {

    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}