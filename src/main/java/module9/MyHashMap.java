package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int size;
    private static final float THRESHOLD = 0.75f;
    private static final int DEFAULT_CAPACITY = 16;

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
    }

    private static class Node<K, V> {
        private final K key;
        private V value;
        private Node<K, V> next;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return getKey().equals(node.getKey()) && getValue().equals(node.getValue()) && next.equals(node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(getKey(), getValue(), next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static int calculateIndex(Object key, int tableCapacity) {
        int hash = key.hashCode();
        return hash & tableCapacity - 1;
    }

    public void put(K k, V v) {
        int index = calculateIndex(k, table.length);
        if (table[index] == null) {
            table[index] = new Node<>(k, v, null);
            size++;
        } else {
            if (table[index].key.equals(k)) {
                table[index].value = v;
            } else {
                table[index].next = new Node<>(k, v, null);
                size++;
            }
        }
    }

    public void remove(K key) {
        int index = calculateIndex(key, table.length);
        var current = table[index];
        if (current != null && current.getKey().equals(key)) {
            table[index] = current.next;
            size--;
        }
        while (current.next != null) {
            if (current.next.getKey().equals(key)) {
                current.next = current.next.next;
                size--;
            }
            current = current.next;
        }
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (table[i].getKey().equals(key)) {
                return table[i].value;
            } else if (table[i].next.getKey().equals(key)) {
                return table[i].next.value;
            }
        }
        return null;
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "table=" + Arrays.toString(table) +
                ", size=" + size +
                '}';
    }
}
