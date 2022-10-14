package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        String result = "";
        while ((str = bufferedReader.readLine()) != null) {
            result += str + " ";
        }
        String[] arr = result.split(" ");
        List<String> users = new ArrayList<>();
        for (int i = 2; i < arr.length - 1; i += 2) {
            users.add(String.valueOf(new Person(arr[i], arr[i + 1])));
        }
        System.out.println(users);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);
        System.out.println(json);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
