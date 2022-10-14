package module10.countword;

import java.util.ArrayList;
import java.util.TreeMap;

public class CountWord {
    public static TreeMap<Integer, String> countWord(ArrayList<String> arr) {
        TreeMap<Integer, String> result = new TreeMap<>();
        int count = 0;
        while (arr.size() != 0){
            String word = arr.get(0);
            while (arr.remove(word)){
                count++;
            }
            result.put(count, word);
            count = 0;
        }
        return result;
    }
}

