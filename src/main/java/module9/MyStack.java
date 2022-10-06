package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> {
    private Object [] arr;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;
    public MyStack(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException();
        }
            arr = new Object[capacity];
    }
    public MyStack(){
        this(DEFAULT_CAPACITY);
    }
    public void push(T element){
        if (arr.length == size){
            Object [] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 1, size);
            arr = newArr;
            arr[0] = element;
        }
        Object [] newArr = new Object[arr.length];
        System.arraycopy(arr,0,newArr,1,size);
        arr = newArr;
        arr[0] = element;
        size++;
    }
    public void remove(int index){
        Objects.checkIndex(index, size);
        T removeElement;
        if (index == 0){
            removeElement = (T) arr[index];
            if(arr[index] == null){
                arr[index - 1] = null;
            }
        }else {
            arr[index] = arr[index + 1];
            arr[index + 1] = null;
            size--;
        }
    }
    public void clear(){
        for (Object ar: arr) {
            ar = null;
        }
        size = 0;
    }
    public int size(){
        return size;
    }
    public T peek(){
        return (T) arr[0];
    }
    public T pop(){
        T removeElement = (T) arr[0];
        size--;
        Object [] newArr = new Object[arr.length];
        System.arraycopy(arr,1,newArr,0,size);
        arr = newArr;
        return removeElement;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
