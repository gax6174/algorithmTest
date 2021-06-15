package com.example.algorithm.lecode.reverset;

/**
 * 单链表的链接顺序反转
 * 输入：1 -> 2 -> 3 -> 4 -> 5
 * 输出：5 -> 4 -> 3 -> 2 -> 1
 * @author seek
 */
public class ReverseSetList {

    static class ListNode {

        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

//        ListNode prev = iterate(listNode1);
//        System.out.println(prev);

        ListNode recursion = recursion(listNode1);
        System.out.println(recursion);
    }

    /**
     * 迭代
     * @param head
     * @return
     */
    public static ListNode iterate(ListNode head) {
        ListNode prev = null, next;
        ListNode cur = head;
        while(null != cur) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public static ListNode recursion(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode newHead =  recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
