package Homework.module7;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text){
        String strUp = text.replaceAll("[^A-Z]", "");
        String strDown = text.replaceAll("[^a-z]", "");
        String result = "";
        if (strDown.length() > strUp.length()){
            result += "Small";
        } else if (strUp.length() > strDown.length()) {
            result += "Big";
        }else {
            result += "Same";
        }
        return result;
    }
}
