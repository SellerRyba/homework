package module11.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabetUpperCase<T> {
    public String sortAlp (List<String> arr){
        List<String> names = new ArrayList<>();
        for (String ar: arr) {
            names.add(ar);
        }
        List<String> sort = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return sort.toString().toUpperCase();
    }
}
