package Homework.module7;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
class WaterCounter{
    public double count(String text){
        double count = 0;
        char [] chars = text.toCharArray();
        for (char ch: chars) {
            if(ch == ' '){
                count++;
            }
        }
        double result = count / chars.length;
        return result;
    }
}
