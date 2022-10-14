package module10.countword;

import java.util.Map;
import java.util.TreeMap;

public class Sort {
    public static void sort(TreeMap<Integer, String> result){
        for (Map.Entry<Integer, String> entry: result.descendingMap().entrySet()
             ) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
