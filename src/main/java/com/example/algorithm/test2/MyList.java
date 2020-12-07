package com.example.algorithm.test2;

/**
 * @author gzj
 * @date 2020/12/7 9:16
 */
public interface MyList<E> {

    public void add(E e);

    public void remove(int i);

    public void remove(Object e);

    public E get(int i);

    public int size();

    public boolean isEmpty();

}
