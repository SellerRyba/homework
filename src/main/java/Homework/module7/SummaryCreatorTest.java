package Homework.module7;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "zeqyesuvohkoukk qocydam";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
class SummaryCreator{
    public String create(String text){
        int a = text.length();
        String str = "";
        char [] chars = text.toCharArray();
        if (a > 15){
            str += chars[15];
            text = text.substring(0, 15);
            if (!str.equals(" ")){
                text = text.substring(0,15) + "...";
            }
        }
        return text;
    }
}
