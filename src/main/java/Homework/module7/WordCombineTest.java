package Homework.module7;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        boolean result = false;
        int count = 0;
        char [] chars = targetWord.toCharArray();
        String str = "";
        for (char ch: chars) {
            str += ch + " ";
        }
        String [] arr = str.split(" ");
        for (String ar: arr) {
            if (sourceWord.toLowerCase().contains(ar.toLowerCase())){
                count++;
            }
        }
        if (count == targetWord.length()){
            result = true;
        }
        return result;
    }
}
