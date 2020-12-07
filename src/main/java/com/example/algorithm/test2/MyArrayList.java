package com.example.algorithm.test2;

/**
 * ArrayList seek
 *
 * @author gzj
 * @date 2020/12/7 9:17
 */
public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int index;
    private int size;

    public MyArrayList() {
        this.data = new Object[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
    }

    @Override
    public void add(E e) {
        // 注意，这里先按照原始值index 赋值，赋值完再加一
        data[index++] = e;
        if (index == size) {
            // 扩容为原数组的2倍，size * 2 + 1 ?
            this.size = size * 2;
            Object[] newData = new Object[this.size];
            for (int i = 0; i < data.length; ++i) {
                newData[i] = data[i];
            }
            // 更新数组为新
            this.data = newData;
        }
    }

    @Override
    public void remove(int i) {
        if (i >= 0 && i < index) {
            // 注意，是data.length - 1 防止数组下标越界
            for (int j = i; j < data.length-1; ++j) {
                data[j] = data[j+1];
            }
            // 维护的index 不能忘
            this.index --;
        }
    }

    @Override
    public void remove(Object e) {
        if (!isEmpty()) {
            for (int i = 0; i < data.length; ++i) {
                if (data[i].equals(e)) {
                    remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public E get(int i) {
        // 查询索引范围的校验
        if (i >= 0 && i < index)
            return (E) this.data[i];
        return null;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index <= 0;
    }

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        Integer integer = new Integer(5);
        list.remove(integer);
        System.out.println(list.get(1));
    }
}
