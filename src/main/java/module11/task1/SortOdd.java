package module11.task1;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class SortOdd<T> {
    public String sortOdd(List<T> names) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        IntStream.range(1, names.size()).filter(index -> index % 2 != 0).forEach(index -> {
            String res = index + ". ";
            stringJoiner.add(res + names.get(index));
        });
        String result = stringJoiner.toString();
        return result;
    }
}
