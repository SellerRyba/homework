package module9;

import java.util.Objects;

public class MyStack<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
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

    public void push(T element) {
        Node newNode = new Node<>(element);
        if (size == 0) {
            head = this.tail = newNode;
        } else {
            head.next = head;
            head = newNode;
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

    public T pop() {
        head = head.next;
        size--;
        return head.element;
    }
}
