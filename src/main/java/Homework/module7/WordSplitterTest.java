package Homework.module7;

import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter{
    private String [] str;
    public String[] split(String phrase){
        String [] originals;
        originals = phrase.split(" ");
        String result = "";
        for (String original: originals) {
            if(!original.isBlank()){
                result += original + " ";
            }
        }
        str = result.toLowerCase().split(" ");
        return str;
    }
}
