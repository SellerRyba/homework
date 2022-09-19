package Homework.module7;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("vys zawofu zime matajilyh yhypno tyxixuy egces", new String[] {"yhypno, egces, zawofu, zime, vys"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
class WordDeleter {
    public String remove(String phrase, String[] words) {
        String result = "";
        String[] arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (arr[i].equals(words[j])) {
                    arr[i] = "";
                }
            }
        }
        for (String ar: arr) {
            if (!ar.equals("")){
                result += ar + " ";
            }
        }
//        result = String.join(" ", arr).replaceAll("\\s+", " ").trim();
        return result.strip();
    }
}