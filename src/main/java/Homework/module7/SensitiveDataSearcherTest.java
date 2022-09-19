package Homework.module7;
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
class SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        boolean result = false;
        String [] sens = {"pass", "key", "login", "email"};
        phrase.toLowerCase();
        for (String sen:sens) {
            if (phrase.toLowerCase().contains(sen)){
                result = true;
            }
        }
        return result;
    }
}

