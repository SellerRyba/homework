package module9;

public class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(2,"asdwqi");
        myHashMap.put(3, "jasdu");
        myHashMap.put(9,"asdsad");
        System.out.println(myHashMap);
        myHashMap.remove(3);
        System.out.println(myHashMap);
        MyArrayList myArrayList = new MyArrayList<>();
        myArrayList.add("asdasd");
        myArrayList.add("jasduasdh");
        myArrayList.add("uwqheqwne");
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(12312);
        myLinkedList.add(9371);
        myLinkedList.add("asdasd");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
    }
}
