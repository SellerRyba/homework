package module9;

import java.util.Objects;

public class MyQueue<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private Node<T> getIndex(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void add(T element) {
        Node newNode = new Node<>(element);
        if (size == 0) {
            head = this.tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        T removeItem;
        if (index == 0) {
            removeItem = head.element;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                Node<T> prev = getIndex(index - 1);
                removeItem = prev.element;
                prev.next = prev.next.next;
                if (index == size - 1) {
                    tail = prev;
                }
            }
        }
        size--;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return head.element;
    }

    public T poll() {
        head = head.next;
        return head.element;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
