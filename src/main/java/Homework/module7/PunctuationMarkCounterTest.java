package Homework.module7;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
class PunctuationMarkCounter{
    public int count(String phrase){
    int cont = 0;
    char[] arr = phrase.toCharArray();
        for (char ar: arr) {
            if(ar == '.'){
                cont += 1;
            } else if (ar == ',') {
                cont += 1;
            } else if (ar == '!') {
                cont += 1;
            } else if (ar == ';') {
                cont += 1;
            }else if (ar == ':'){
                cont += 1;
            }
        }
        return cont;
    }
}
