package com.example.algorithm.test3;

/**
 * @author gzj
 * @date 2020/12/8 9:08
 */
public interface MyStack<Item> {

    MyStack<Item> push(Item item);

    Item pop();

    int size();

    boolean isEmpty();
}
