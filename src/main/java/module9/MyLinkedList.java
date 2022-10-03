package module9;

import java.util.Objects;

public class MyLinkedList<T> {

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

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T element) {
        Node newNode = new Node<>(element);
        if (size == 0) {
            first = this.last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    private Node<T> getIndex(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removeItem;
        if (index == 0) {
            removeItem = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prev = getIndex(index - 1);
            removeItem = prev.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;

        return removeItem;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return getIndex(index).element;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
