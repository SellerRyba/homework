package Homework.module7;


class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter{
    public int count(String phrase){

        char [] chars = phrase.toCharArray();
        int cont = phrase.length();
        for (int i = 0; i < chars.length; i++) {
            if ((phrase.indexOf(chars[i])) != i){
                cont--;
            }
        }
        return cont;
    }
}
