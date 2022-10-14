package module10.countword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<String> words(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        String result = "";
        while ((str = bufferedReader.readLine()) != null) {
            result += str + " ";
        }
        String [] newArr = result.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for (String ar: newArr) {
            arr.add(ar);
        }
        return arr;
    }
}

