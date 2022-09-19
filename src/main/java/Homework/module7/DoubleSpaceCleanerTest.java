package Homework.module7;

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));

    }
}
class DoubleSpaceCleaner{
    public String clean(String phrase){
        String [] originals = phrase.split(" ");
        String result = "";
        for (String original: originals) {
            if(!original.isBlank()){
                result += original + " ";
            }
        }
        return result.strip();

    }
}

