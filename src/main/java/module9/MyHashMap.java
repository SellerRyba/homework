package module9;

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

    public void remove(K key){
        for (int i = 0; i < size; i++) {
            if (table[i].getKey().equals(key)) {
                table[i] = table[i + 1];
                size--;
            }
            }
    }

    public V get(K key){
        for (int i = 0; i < size; i++) {
            if (table[i].getKey().equals(key)){
                return table[i].value;
            }
        }
        return null;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            table[i] = null;
            table[i].next = null;
        }
        size = 0;
    }

    public int size(){
        return size;
    }

}
