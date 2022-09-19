package Homework.module7;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
class EmailDetector{
    public boolean isPresent(String text){
        boolean result = false;
        int ch = 0;
        char [] arr = text.toCharArray();
        if (text.contains("@")){
            ch = text.indexOf("@");
             if (arr[ch - 1] != ' ' && arr[ch + 1] != ' ' && arr[ch - 2] != ' ' && arr[ch + 2] != ' '){
                 result = true;
            }

        }


        return result;
    }
}
