package module9;

import java.util.Objects;

public class MyLinkedList<E> {
    static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E value) {
        Node<E> node = new Node (value);
        if (size == 0){
            first = last = node;
        } else {
            this.last.next = node;
            last = node;
        }
        size++;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        E removeItem;
        if (index == 0){
            removeItem = first.item;
            first = first.next;
            if (first == null){
                last = null;
            }
        }else {
            Node<E> prev = getIndex(index - 1);
            prev = (Node<E>) prev.item;
            prev.next = prev.next.next;
            if (index == size - 1){
                last = prev;
            }
        }
        size--;
    }

    public void clear() {

    }

    public int size() {
        return size;
    }
    private Node<E> getIndex(int index){
        Node <E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node<E> get(int index) {
        Objects.checkIndex(index, size);
        return getIndex(index);
    }
}
