package Homework.module7;

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
class ShortWordCounter{
    public int count(String phrase, int minLength){
        int cont = 0;
        String [] results = phrase.split(" ");
        for (String result: results) {
            if (result.length() <= minLength){
                cont++;
            }
        }

        return cont;
    }
}
