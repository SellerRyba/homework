package module11.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MixStream {
//    public static void main(String[] args) {
//        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
//        Stream<Integer> second = Stream.of(20, 30, 40, 50, 60);
//        zip(first, second)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> result = new ArrayList<>();
        while (firstIterator.hasNext() && secondIterator.hasNext()){
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
        return result.stream();
    }
}
