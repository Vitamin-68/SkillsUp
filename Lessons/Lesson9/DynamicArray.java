package Lesson9;

import java.util.Arrays;

public class DynamicArray<E> {
    private Object[] data;
    private int size;

    public DynamicArray() {
        this.data = new Object[10];
    }

    public void add(E e) {
        data[size] = e;
        size++;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
