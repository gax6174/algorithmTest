package com.example.algorithm.test2;

/**
 * 双向链表 seek
 *
 * @author gzj
 * @date 2020/12/7 9:17
 */
public class DoubleLinkList {

    private DNode head;
    private DNode tail;

    DoubleLinkList(){
        head = null;
        tail = null;
    }

    public void insertHead(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.pre = newNode;
        }
        head = newNode;
    }

    public void deleteHead() {
        if (head == null) {
            return ;
        }
        else if (head.next == null) {
            tail = null;
        }
        else {
            head.next.pre = null;
        }
        head = head.next;
    }

    public void deleteKey(int data) {

        DNode cur = head;
        if (cur == null) {return;}
        while (cur.value != data) {
            if (cur.next == null) {
                return;
            }
            cur = cur.next;
        }
        if (cur == head) {
            deleteHead();
        } else {
          cur.pre.next = cur.next;
          if (cur == tail) {
              tail = cur.pre;
              cur.pre = null;
          }
          else {
              cur.next.pre = cur.pre;
          }
        }
    }
}


class DNode{

    int value;
    DNode next;
    DNode pre;

    DNode(int value){
        this.value = value;
        this.next = null;
        this.pre = null;
    }
}