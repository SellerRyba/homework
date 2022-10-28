package module11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers<T> {
    public String sortNumbers(List<String> arr){
        String result = arr.stream()
                .map(ar -> Arrays.asList(ar.split(", ")))
                .flatMap(list -> list.stream())
                .sorted()
                .collect(Collectors.joining(", "));
        return result;
    }
}
