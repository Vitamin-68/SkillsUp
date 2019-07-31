package Lesson9;

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
}
