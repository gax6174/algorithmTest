package com.example.algorithm.test3;

/**
 * 数组实现栈
 *
 * @author gzj
 * @date 2020/12/8 9:10
 */
public class ArrayStack<Item> implements MyStack<Item> {


    /** 设置起始大小 */
    private Item[] items = (Item[]) new Object[1];
    private int n = 0;

    ArrayStack(int cap) {
        this.items = (Item[]) new Object[cap];
    }

    /** 入栈，时间复杂度 O(1) */
    @Override
    public MyStack<Item> push(Item item) {
        judgeSize();
        items[n++] = item;
        return null;
    }

    private void judgeSize() {
        /** 扩容，注意这里是 >= */
        if (n >= items.length) {
            resize(2 * items.length);
        }
        /** 缩容 */
        else if (n > 0 && n <= items.length/2) {
            resize(items.length/2);
        }
    }

    /** 扩容 O(n) */
    private void resize(int size) {
        System.out.println("扩容促发");
        Item[] temp = (Item[])new Object[size];
        for (int i = 0; i < n; ++i) {
            temp[i] = items[i];
        }
        items = temp;
    }

    /** 出栈 O(1) */
    @Override
    public Item pop() {
        if (isEmpty()){
            return null;
        }
        Item item = items[--n];
        /** 释放空间 */
        items[n] = null;
        return item;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public static void main(String[] args){
        MyStack<Character> stack = new ArrayStack<>(10);
        char c = '{';
        stack.push(c);
        System.out.println(stack.pop());
    }
}
