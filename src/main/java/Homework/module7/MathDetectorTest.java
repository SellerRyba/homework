package Homework.module7;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
class MathDetector{
    public boolean isMath(String text){
        boolean result = false;
        String str = text.replaceAll("[^0-9]", "");
        if (str.length() >= 2){
                    if (text.contains("=")){
                        if (text.contains("+") || text.contains("-") || text.contains("/") || text.contains("*")){
                            result = true;
                        }
                    }
        }
                    return result;
    }
}
