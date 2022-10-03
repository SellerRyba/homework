package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private Object[] arr;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        arr = new Object[capacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(E value) {
        if (arr.length == size) {
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = value;
        size++;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        int reSize = size - index - 1;
        E removedIndex = (E) arr[index];
        System.arraycopy(arr, index + 1, arr, index, reSize);
        arr[--size] = null;
    }

    public void clear() {
        size = 0;
        arr = new Object[DEFAULT_CAPACITY];
    }

    public Object size() {
        return size;
    }

    public Object get(int index) {
        Objects.checkIndex(index, size);
        return (E) arr[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
