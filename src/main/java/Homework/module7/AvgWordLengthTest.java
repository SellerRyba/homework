package Homework.module7;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength{
    public double count(String phrase){
        double result = 0;
        double res;
        String [] arr = phrase.split(" ");
        for (String ar: arr) {
            result += ar.length();
        }
        res = result / arr.length;
        return res;
    }
}
