package Homework.module7;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
class PalindromeCounter{
    public int count(String phrase){
        int cont = 0;
        String str = "";
        String [] results = phrase.toLowerCase().split(" ");
        for (String result: results) {

            if (new StringBuilder(result).reverse().toString().equals(result)){
                cont++;
            }
        }
        return cont;
    }
}
