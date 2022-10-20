package module11;

import module11.task1.SortOdd;
import module11.task2.SortAlphabetUpperCase;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = List.of("Ivan", "Peter", "Max", "Illya", "Andrii");
        SortOdd<String> sort = new SortOdd<>();
        System.out.println(sort.sortOdd(arrayList));
        SortAlphabetUpperCase sortAlphabetUpperCase = new SortAlphabetUpperCase();
        System.out.println(sortAlphabetUpperCase.sortAlp(arrayList));
    }
}
