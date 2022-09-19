package Homework.module7;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter{
    public int count(String text){
        String [] arr = text.split(" ");
        String result;
        int count = 0;
        int len;
        for (String ar: arr) {
            result = ar.replaceAll("[^A-Z]", "");
            len = result.length();
            if (len == 1){
                count++;
            }
        }
        return count;
    }
}
