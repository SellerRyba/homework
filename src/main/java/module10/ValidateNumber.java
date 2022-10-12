package module10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ValidateNumber {
    String fileName;
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            if (str.matches("\\d{3}[-\\.]\\d{3}[-\\.]\\d{4}")){
                System.out.println(str);
            } else if (str.matches("\\(\\d{3}\\)[.\\s.]\\d{3}[-\\.]\\d{4}")) {
                System.out.println(str);
            }
        }
    }
}
