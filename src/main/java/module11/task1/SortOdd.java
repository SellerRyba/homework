package module11.task1;

import java.util.List;
import java.util.StringJoiner;

public class SortOdd<T> {
    public String sortOdd(List<T> names) {
        String res = "";
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = 1; i < names.size() - 1; i+= 2) {
            res = i + "." + names.get(i);
            stringJoiner.add(res);
        }
        res = stringJoiner.toString();
        return res;
    }
}
