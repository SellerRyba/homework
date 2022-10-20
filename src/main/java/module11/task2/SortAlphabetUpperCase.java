package module11.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class SortAlphabetUpperCase {
    public String sortAlp (List<String> arr){
        List<String> sortArr = new ArrayList<>();
        String result = "";
        for (String ar: arr) {
            sortArr.add(ar);
        }
        Collections.sort(sortArr);
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = sortArr.size() - 1; i >= 0; i--) {
            stringJoiner.add(sortArr.get(i));
        }
        result = stringJoiner.toString();
        return result;
    }
}
